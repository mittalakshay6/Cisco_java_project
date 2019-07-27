package main.java.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import main.java.constant.OrderType;
import main.java.domain.Customer;
import main.java.domain.CustomerOrders;
import main.java.domain.Orders;
import main.java.domain.Product;
import main.java.pojo.OnlineOfflineProduct;
import main.java.pojo.OrderTime;
import main.java.resource.CustomerOrdersResource;
import main.java.resource.CustomerResource;
import main.java.resource.ProductResource;

@Path("statistics")
public class StatisticsController {
	
	@Path("/getCustomerList")
	@Produces("application/json")
	@GET
	public List<Customer> getCustomerList()
	{

		List<Customer> customers=new ArrayList<>();
		try
		{
			CustomerResource customerResource=new CustomerResource();
			return customerResource.getCustomers();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return customers;
	}
	

	@Path("/getStatisticOnHoursBasis")
	@Produces("application/json")
	@GET
	public Object getStatisticOnHoursBasis()
	{
		
		try
		{
			List<CustomerOrders> customerOrderList=CustomerOrdersResource.customerOrderList;
			
			int order8to9   =0;
			int order9to10  =0;
			int order10to11 =0;
			int order11to12 =0;
			int order12to13 =0;
			int order13to14 =0;
			int order14to15 =0;
			int order15to16 =0;
			int order16to17 =0;
			int order17to18 =0;
			int order18to19 =0;
			int order19to20 =0;
			int order20to21 =0;
			int order21to22 =0;
			
			for (CustomerOrders customerOrders : customerOrderList) {
				
				switch (customerOrders.getOrderDateTime().getHours()) {
				case 8:
					order8to9=order8to9+1;
				break;
				case 9:
					order9to10=order9to10+1;
				break;
				case 10:
					order10to11=order10to11+1;
				break;
				case 11:
					order11to12=order11to12+1;
				break;
				case 12:
					order12to13=order12to13+1;
				break;
				case 13:
					order13to14=order13to14+1;
				break;
				case 14:
					order14to15=order14to15+1;
				break;
				case 15:
					order15to16=order15to16+1;
				break;
				case 16:
					order16to17=order16to17+1;
				break;
				case 17:
					order17to18=order17to18+1;
				break;
				case 18:
					order18to19=order18to19+1;
				break;
				case 19:
					order19to20=order19to20+1;
				break;
				case 20:
					order20to21=order20to21+1;
				break;
				case 21:
					order21to22=order21to22+1;
				break;

				default:
					break;
				}
			}

			int totalOrders=order8to9 + order9to10 + order10to11 + order11to12 + order12to13 + order13to14 
					+ order14to15 + order15to16 + order16to17 + order17to18 + order18to19 + order19to20
					+ order20to21 + order21to22;
			
			OrderTime orderTime=new OrderTime();
			orderTime.setOrder8to9((order8to9  !=0?((order8to9*100)/totalOrders):0) +" %");
			orderTime.setOrder9to10 ((order9to10 !=0?((order9to10 *100)/totalOrders):0)+" %");
			orderTime.setOrder10to11((order10to11!=0?((order10to11*100)/totalOrders):0)+" %");
			orderTime.setOrder11to12((order11to12!=0?((order11to12*100)/totalOrders):0)+" %");
			orderTime.setOrder12to13((order12to13!=0?((order12to13*100)/totalOrders):0)+" %");
			orderTime.setOrder13to14((order13to14!=0?((order13to14*100)/totalOrders):0)+" %");
			orderTime.setOrder14to15((order14to15!=0?((order14to15*100)/totalOrders):0)+" %");
			orderTime.setOrder15to16((order15to16!=0?((order15to16*100)/totalOrders):0)+" %");
			orderTime.setOrder16to17((order16to17!=0?((order16to17*100)/totalOrders):0)+" %");
			orderTime.setOrder17to18((order17to18!=0?((order17to18*100)/totalOrders):0)+" %");
			orderTime.setOrder18to19((order18to19!=0?((order18to19*100)/totalOrders):0)+" %");
			orderTime.setOrder19to20((order19to20!=0?((order19to20*100)/totalOrders):0)+" %");
			orderTime.setOrder20to21((order20to21!=0?((order20to21*100)/totalOrders):0)+" %");
			orderTime.setOrder21to22((order21to22!=0?((order21to22*100)/totalOrders):0)+" %");
			return orderTime;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * get Statistic On Men WoMen Hours Basis
	 * @return
	 */

	@Path("/getStatisticMenWomenOnHoursBasis")
	@Produces("application/json")
	@GET
	public Object getStatisticOnMenWoMenHoursBasis()
	{
		
		try
		{
			List<CustomerOrders> customerOrderList=CustomerOrdersResource.customerOrderList;
			CustomerResource customerResource=new CustomerResource();
			List<Customer> listOfCoustomer=new ArrayList<>();
			listOfCoustomer=customerResource.getCustomers();
			
			
			int Morder8to9   =0;
			int Morder9to10  =0;
			int Morder10to11 =0;
			int Morder11to12 =0;
			int Morder12to13 =0;
			int Morder13to14 =0;
			int Morder14to15 =0;
			int Morder15to16 =0;
			int Morder16to17 =0;
			int Morder17to18 =0;
			int Morder18to19 =0;
			int Morder19to20 =0;
			int Morder20to21 =0;
			int Morder21to22 =0;
			
			int Forder8to9   =0;
			int Forder9to10  =0;
			int Forder10to11 =0;
			int Forder11to12 =0;
			int Forder12to13 =0;
			int Forder13to14 =0;
			int Forder14to15 =0;
			int Forder15to16 =0;
			int Forder16to17 =0;
			int Forder17to18 =0;
			int Forder18to19 =0;
			int Forder19to20 =0;
			int Forder20to21 =0;
			int Forder21to22 =0;
			List<OrderTime> orderTimeForMaleFemale=new ArrayList<>();
			
			
			for (CustomerOrders customerOrders : customerOrderList) {
	
				for (Customer customer : listOfCoustomer) {
					if(customerOrders.getCustomerId()==customer.getId()) {
						
						if(customer.getGender().equals("M")) {
							switch (customerOrders.getOrderDateTime().getHours()) {
							case 8:
								Morder8to9=Morder8to9+1;
							break;
							case 9:
								Morder9to10=Morder9to10+1;
							break;
							case 10:
								Morder10to11=Morder10to11+1;
							break;
							case 11:
								Morder11to12=Morder11to12+1;
							break;
							case 12:
								Morder12to13=Morder12to13+1;
							break;
							case 13:
								Morder13to14=Morder13to14+1;
							break;
							case 14:
								Morder14to15=Morder14to15+1;
							break;
							case 15:
								Morder15to16=Morder15to16+1;
							break;
							case 16:
								Morder16to17=Morder16to17+1;
							break;
							case 17:
								Morder17to18=Morder17to18+1;
							break;
							case 18:
								Morder18to19=Morder18to19+1;
							break;
							case 19:
								Morder19to20=Morder19to20+1;
							break;
							case 20:
								Morder20to21=Morder20to21+1;
							break;
							case 21:
								Morder21to22=Morder21to22+1;
							break;

							default:
								break;
							}

						}else {
						
						switch (customerOrders.getOrderDateTime().getHours()) {
						case 8:
							Forder8to9=Forder8to9+1;
						break;
						case 9:
							Forder9to10=Forder9to10+1;
						break;
						case 10:
							Forder10to11=Forder10to11+1;
						break;
						case 11:
							Forder11to12=Forder11to12+1;
						break;
						case 12:
							Forder12to13=Forder12to13+1;
						break;
						case 13:
							Forder13to14=Forder13to14+1;
						break;
						case 14:
							Forder14to15=Forder14to15+1;
						break;
						case 15:
							Forder15to16=Forder15to16+1;
						break;
						case 16:
							Forder16to17=Forder16to17+1;
						break;
						case 17:
							Forder17to18=Forder17to18+1;
						break;
						case 18:
							Forder18to19=Forder18to19+1;
						break;
						case 19:
							Forder19to20=Forder19to20+1;
						break;
						case 20:
							Forder20to21=Forder20to21+1;
						break;
						case 21:
							Forder21to22=Forder21to22+1;
						break;

						default:
							break;
						}
						
					}
				}
			}
			
			
		}

			int totalOrders=Morder8to9 + Morder9to10 + Morder10to11 + Morder11to12 + Morder12to13 + Morder13to14 
					+ Morder14to15 + Morder15to16 + Morder16to17 + Morder17to18 + Morder18to19 + Morder19to20
					+ Morder20to21 + Morder21to22+Forder8to9 + Forder9to10 + Forder10to11 + Forder11to12 + Forder12to13 + Forder13to14 
					+ Forder14to15 + Forder15to16 + Forder16to17 + Forder17to18 + Forder18to19 + Forder19to20
					+ Forder20to21 + Forder21to22;
			
			
			OrderTime orderTimeMale=new OrderTime();
			orderTimeMale.setGender("Male");
			orderTimeMale.setOrder8to9((Morder8to9 !=0?((Morder8to9*100)/     totalOrders):0) +" %");
			orderTimeMale.setOrder9to10 ((Morder9to10 !=0?((Morder9to10 *100)/totalOrders):0)+" %");
			orderTimeMale.setOrder10to11((Morder10to11!=0?((Morder10to11*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder11to12((Morder11to12!=0?((Morder11to12*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder12to13((Morder12to13!=0?((Morder12to13*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder13to14((Morder13to14!=0?((Morder13to14*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder14to15((Morder14to15!=0?((Morder14to15*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder15to16((Morder15to16!=0?((Morder15to16*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder16to17((Morder16to17!=0?((Morder16to17*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder17to18((Morder17to18!=0?((Morder17to18*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder18to19((Morder18to19!=0?((Morder18to19*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder19to20((Morder19to20!=0?((Morder19to20*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder20to21((Morder20to21!=0?((Morder20to21*100)/totalOrders):0)+" %");
			orderTimeMale.setOrder21to22((Morder21to22!=0?((Morder21to22*100)/totalOrders):0)+" %");
			
			
			OrderTime orderTimeFeMale=new OrderTime();
			orderTimeFeMale.setGender("FeMale");
			orderTimeFeMale.setOrder8to9((Forder8to9 !=0?((Forder8to9*100)/     totalOrders):0) +" %");
			orderTimeFeMale.setOrder9to10 ((Forder9to10 !=0?((Forder9to10 *100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder10to11((Forder10to11!=0?((Forder10to11*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder11to12((Forder11to12!=0?((Forder11to12*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder12to13((Forder12to13!=0?((Forder12to13*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder13to14((Forder13to14!=0?((Forder13to14*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder14to15((Forder14to15!=0?((Forder14to15*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder15to16((Forder15to16!=0?((Forder15to16*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder16to17((Forder16to17!=0?((Forder16to17*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder17to18((Forder17to18!=0?((Forder17to18*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder18to19((Forder18to19!=0?((Forder18to19*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder19to20((Forder19to20!=0?((Forder19to20*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder20to21((Forder20to21!=0?((Forder20to21*100)/totalOrders):0)+" %");
			orderTimeFeMale.setOrder21to22((Forder21to22!=0?((Forder21to22*100)/totalOrders):0)+" %");
			orderTimeForMaleFemale.add(orderTimeMale);
			orderTimeForMaleFemale.add(orderTimeFeMale);
			
			return orderTimeForMaleFemale;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	

	/**
	 * This method is used for get statistics on each product 
	 * @return
	 */
	@Path("/getStatisticOnOrderProduct")
	@Produces("application/json")
	@GET
	public Object getStatisticOnOrderProduct()
	{
		List<Product> products=new ArrayList<>();
		try
		{
			
			int product1=0;
			int product2=0;
			int product3=0;
			int product4=0;
			int product5=0;
			int product6=0;
			int product7=0;
			int product8=0;
			int product9=0;
			
			List<CustomerOrders> customerOrderList=CustomerOrdersResource.customerOrderList;
			ProductResource productResource=new ProductResource();
			List<Product> productList=productResource.getProducts();
			for (CustomerOrders customerOrders : customerOrderList) {
			
				for (Orders order : customerOrders.getOrders()) {
					for (Product product : productList) {
						if(product.getProductId()==order.getProductId()) {
							switch (product.getProductId()) {
							case 1:
								product1=product1+order.getProductQuntity();
							break;
							case 2:
								product2=product2+order.getProductQuntity();							
							break;
							case 3:
								product3=product3+order.getProductQuntity();
								break;
							case 4:
								product4=product4+order.getProductQuntity();
								break;
							case 5:
								product5=product5+order.getProductQuntity();
								break;
							case 6:
								product6=product6+order.getProductQuntity();
								break;
							case 7:
								product7=product7+order.getProductQuntity();
								break;
							case 8:
								product8=product8+order.getProductQuntity();
								break;
							case 9:
								product9=product9+order.getProductQuntity();
								break;
							}
							
						}
					}
				}
			}
			
			
			for (Product product : productList) {
				
			switch (product.getProductId()) {
				
				case 1:
					product.setProductQuntity(product1);	
				break;
				case 2:
					product.setProductQuntity(product2);	
				break;
				
				case 3:
					product.setProductQuntity(product3);	
				break;
				case 4:
					product.setProductQuntity(product4);	
				break;
				case 5:
					product.setProductQuntity(product5);	
				break;
				case 6:
					product.setProductQuntity(product6);	
				break;
				case 7:
					product.setProductQuntity(product7);	
				break;
				case 8:
					product.setProductQuntity(product8);	
				break;
				case 9:
					product.setProductQuntity(product9);	
				break;
				default:
					break;
				}
				products.add(product);
			}
			
			return products;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	
	
	/**
	 * This method is used for get statistics on Online offline order
	 * @return
	 */
	@Path("/getStatisticOnOnlineOfflineOrder")
	@Produces("application/json")
	@GET
	public Object getStatisticOnOnlineOfflineOrder()
	{
		//List<OnlineOfflineProduct> onlineOfflineProductCount=new ArrayList<>();
		//OnlineOfflineProduct onlineOfflineProductCount=new OnlineOfflineProduct();
		OnlineOfflineProduct onlineOfflineProduct=new OnlineOfflineProduct();
		try
		{
			int online=0;
			int offline=0;
			List<CustomerOrders> customerOrderList=CustomerOrdersResource.customerOrderList;
			for (CustomerOrders customerOrders : customerOrderList) {
			   if(customerOrders.getOrderType().equals(OrderType.Online)) {
				   online=online+1;
			   }else {
				   offline=offline+1;
			   }
			}
			
			onlineOfflineProduct.setOnlineOrder(online);
			onlineOfflineProduct.setOfflineOrder(offline);
			//onlineOfflineProductCount.add(onlineOfflineProduct);
			return onlineOfflineProduct;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return onlineOfflineProduct;
	}
	
	
}
