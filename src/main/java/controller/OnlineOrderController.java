package main.java.controller;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.HttpStatus;

import main.java.constant.OrderType;
import main.java.domain.CustomerOrders;
import main.java.pojo.CustomerDeliveryInformation;
import main.java.pojo.Result;
import main.java.resource.CustomerOrdersResource;
import main.java.resource.CustomerResource;
import main.java.resource.OnlineOrderResource;

@Path("Order")
public class OnlineOrderController {
	
	 
	CustomerResource customerResource=new CustomerResource(); 
	 
	
	/**
	 * Online Web service for online ordered
	 * @param customerDeliveryInformation
	 * @return
	 */
	@Path("/Online")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	public Result getOrderOnline(CustomerDeliveryInformation customerDeliveryInformation)
	{
		//System.out.println("Hi");
		//System.out.println(customerDeliveryInformation.toString());
		

		OnlineOrderResource onlineOrderResource=new OnlineOrderResource();

		Result result=new Result();
		Date currentDate=new Date();
		try
		{
			//check current time 
			//if current time in between 8 am to 10 am then proceed otherwise reject
			//customerDeliveryInformation.
			if(currentDate.getHours()>=8 && currentDate.getHours()<=10) {
				//in between 8 to 10
				result=onlineOrderResource.orderInBetween8TO10(customerDeliveryInformation,OrderType.Online.toString());
			}else {
				result=onlineOrderResource.orderInBetween10TO10(customerDeliveryInformation,OrderType.Online.toString());
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println(customerDeliveryInformation);
		for(CustomerOrders co: CustomerOrdersResource.customerOrderList)
		System.out.println(co.toString());
		return result;
	}
	
	/**
	 * Offline web service for put offline order 
	 * @param customerDeliveryInformation
	 * @return
	 */
	@Path("/Offline")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	@POST
	public Result getOrderOffline(CustomerDeliveryInformation customerDeliveryInformation)
	{
		System.out.println(customerDeliveryInformation);
		OnlineOrderResource onlineOrderResource=new OnlineOrderResource();
		Result result=new Result();
		try
		{
			//if current time in between 8 am to 10 am then proceed otherwise reject
			Date currentDate=new Date();
			if(currentDate.getHours()>10) {
				//in between 8 to 10
				result=onlineOrderResource.orderInBetween10TO10(customerDeliveryInformation,OrderType.OffLine.toString());
			}else {
			
				result.setCode(HttpStatus.SC_UNAUTHORIZED);
				result.setMessage("offline Order Not valid before 10 am");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println(result);
		return result;
	}
	
	

}
