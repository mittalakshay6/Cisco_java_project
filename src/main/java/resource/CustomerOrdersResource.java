package main.java.resource;

import java.util.ArrayList;
import java.util.List;

import main.java.domain.CustomerOrders;

public class CustomerOrdersResource {
	
	public static List<CustomerOrders> customerOrderList=new ArrayList<>();

	public static void addCustomerOrder(CustomerOrders customerOrders) {
		
		customerOrderList.add(customerOrders);
		
	}

	public static List<CustomerOrders> getCustomerOrderList() {
		return customerOrderList;
	}

	
	
	
	
	

}
