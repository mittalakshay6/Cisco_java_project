package main.java.resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.HttpStatus;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import main.java.domain.Customer;
import main.java.domain.CustomerOrders;
import main.java.domain.Orders;
import main.java.pojo.CustomerDeliveryInformation;
import main.java.pojo.Order;
import main.java.pojo.Result;

public class OnlineOrderResource {
	
	CustomerResource customerResource=new CustomerResource(); 
	
	/**
	 * Json Map in existing pojo
	 * @param customerDeliveryInformation
	 * @return
	 */
//	public CustomerDeliveryInformation jsonToOnlineOrderResource(String customerDeliveryInformation) {
//		ObjectMapper mapper = new ObjectMapper();
//		CustomerDeliveryInformation customeDelivery=new CustomerDeliveryInformation();
//		try {
//			customeDelivery = mapper.readValue(customerDeliveryInformation, CustomerDeliveryInformation.class);
//		} catch (JsonParseException e) {
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return customeDelivery;
//		
//	}
	
	/**
	 * Order Inn between 8 to 10
	 * @param customerDeliveryInformation
	 * @return
	 */
	public Result orderInBetween8TO10(CustomerDeliveryInformation customerDeliveryInformation , String OrderType) {
		
		Result result=new Result();
		
		OnlineOrderResource onlineOrderResource=new OnlineOrderResource();
		//CustomerDeliveryInformation customeDelivery = onlineOrderResource.jsonToOnlineOrderResource(customerDeliveryInformation);
		CustomerDeliveryInformation customeDelivery = customerDeliveryInformation;
		customeDelivery.setOrderType(OrderType);
		
		CustomerOrders customerOrders=new CustomerOrders();
		
		//if customer is not already register in mcdonalds return error message and not to proceed order 
		boolean isValidCustomer=false;
		List<Customer> customes=customerResource.getCustomers();
		for (Customer customer : customes) {
			//System.out.println(customeDelivery.getCustomerId() +" : "+customer.getId());
			if(customeDelivery.getCustomerId()==customer.getId())
			{
				isValidCustomer=true;
				break;
			}
		}
		
		//if valid customer then proceed
		if(isValidCustomer) {
			
			//check coupon code HappyHour10 is applicable or not 
			if(customeDelivery.getCoupenCode()!=null) {
				if(!customeDelivery.getCoupenCode().equals("HappyHour10")) {
					result.setCode(HttpStatus.SC_UNAUTHORIZED);
					result.setMessage("Coupen Code is invalid");
					return result;
				}
			}
			//Generate new order id and return in response
			customerOrders.setOrderId(CustomerOrdersResource.customerOrderList.size()+1);
			customerOrders.setCustomerId(customeDelivery.getCustomerId());
			customerOrders.setDeliveryAddress(customeDelivery.getDeliveryAddress());
			customerOrders.setEmail(customeDelivery.getEmail());
			customerOrders.setMobileNumber(customeDelivery.getMobileNumber());
			customerOrders.setPincode(customeDelivery.getPincode());
			customerOrders.setOrderDateTime(new Date());
			customerOrders.setOrderType(customeDelivery.getOrderType());
			List<Orders> orders=new ArrayList<>();
			for (Order order : customeDelivery.getOrders()) {
				Orders ordersObj=new Orders();
				ordersObj.setProductId(order.getProductId());
				ordersObj.setProductQuntity(order.getProductQuntity());
				orders.add(ordersObj);
			}	
			customerOrders.setOrders(orders);
			CustomerOrdersResource.addCustomerOrder(customerOrders);
			
		}else {
			result.setCode(HttpStatus.SC_UNAUTHORIZED);
			result.setMessage("customer is not registered ");
			return result;
		}
		
		result.setCode(HttpStatus.SC_OK);
		result.setMessage("OrderId : "+customerOrders.getOrderId());
		return result;
			
	}

	/**
	 * order In Between 10 am  TO 10 pm
	 * @param customerDeliveryInformation
	 * @param orderType
	 * @return
	 */
	public Result orderInBetween10TO10(CustomerDeliveryInformation customerDeliveryInformation,String orderType) {
		Result result=new Result();
		
		OnlineOrderResource onlineOrderResource=new OnlineOrderResource();
		//CustomerDeliveryInformation customeDelivery = onlineOrderResource.jsonToOnlineOrderResource(customerDeliveryInformation);
		CustomerDeliveryInformation customeDelivery = customerDeliveryInformation;
		customeDelivery.setOrderType(orderType);
		
		CustomerOrders customerOrders=new CustomerOrders();
		
		//if customer is not already register in mcdonalds return error message and not to proceed order 
		boolean isValidCustomer=false;
		List<Customer> customes=customerResource.getCustomers();
		for (Customer customer : customes) {
			//System.out.println(customeDelivery.getCustomerId() +" : "+customer.getId());
			if(customeDelivery.getCustomerId()==customer.getId())
			{
				isValidCustomer=true;
				break;
			}
		}
		
		//if valid customer then proceed
		if(isValidCustomer) {
			
			//check coupon code HappyHour10 is applicable or not 
			if(customeDelivery.getCoupenCode()!=null) {
				if(customeDelivery.getCoupenCode().equals("HappyHour10")) {
					result.setCode(HttpStatus.SC_UNAUTHORIZED);
					result.setMessage("Coupen Code is invalid");
					return result;
				}
			}
			//Generate new order id and return in response
			customerOrders.setOrderId(CustomerOrdersResource.customerOrderList.size()+1);
			customerOrders.setCustomerId(customeDelivery.getCustomerId());
			customerOrders.setDeliveryAddress(customeDelivery.getDeliveryAddress());
			customerOrders.setEmail(customeDelivery.getEmail());
			customerOrders.setMobileNumber(customeDelivery.getMobileNumber());
			customerOrders.setPincode(customeDelivery.getPincode());
			customerOrders.setOrderDateTime(new Date());
			customerOrders.setOrderType(customeDelivery.getOrderType());
			List<Orders> orders=new ArrayList<>();
			for (Order order : customeDelivery.getOrders()) {
				Orders ordersObj=new Orders();
				ordersObj.setProductId(order.getProductId());
				ordersObj.setProductQuntity(order.getProductQuntity());
				orders.add(ordersObj);
			}	
			customerOrders.setOrders(orders);
			CustomerOrdersResource.addCustomerOrder(customerOrders);
			
		}else {
			result.setCode(HttpStatus.SC_UNAUTHORIZED);
			result.setMessage("customer is not registered ");
			return result;
		}
		
		result.setCode(HttpStatus.SC_OK);
		result.setMessage("OrderId : "+customerOrders.getOrderId());
		return result;
		
	}

}
