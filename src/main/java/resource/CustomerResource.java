package main.java.resource;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import main.java.domain.Customer;

public class CustomerResource {
	
      List<Customer> customers=new ArrayList<>();
	
	public CustomerResource() {
	
		Calendar cal = Calendar.getInstance();
	    
		Customer customer=new Customer();
		customer.setId(1);
		customer.setName("Jan Koum");
		customer.setAddress("Mumbai Boriwali");
		cal.set(1985, 1, 8); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("M");
		customers.add(customer);
		
		customer=new Customer();
		customer.setId(2);
		customer.setName("Tony Bates");
		customer.setAddress("Mumbai dombiwali");
		cal.set(1978, 05, 12); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("M");
		customers.add(customer);
		
		customer=new Customer();
		customer.setId(3);
		customer.setName("Marissa Mayer");
		customer.setAddress("Navi Mumbai");
		cal.set(1978, 03, 04); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("M");
		customers.add(customer);
		
		customer=new Customer();
		customer.setId(4);
		customer.setName("Jeff Weiner");
		customer.setAddress("pune");
		cal.set(1978, 107, 29); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("M");
		customers.add(customer);
		
		
		customer=new Customer();
		customer.setId(5);
		customer.setName("Sundar Pichai");
		customer.setAddress("nagpur");
		cal.set(1978, 06, 06); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("M");
		customers.add(customer);
		
		
		customer=new Customer();
		customer.setId(6);
		customer.setName("Mark Zuckerberg");
		customer.setAddress("kolhapur");
		cal.set(1978, 01, 30); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("M");
		customers.add(customer);
		
		
		customer=new Customer();
		customer.setId(7);
		customer.setName("Roshani");
		customer.setAddress("kolhapur");
		cal.set(2000, 01, 30); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("F");
		customers.add(customer);
		
		
		customer=new Customer();
		customer.setId(8);
		customer.setName("Pooja");
		customer.setAddress("kolhapur");
		cal.set(2000, 01, 30); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("F");
		customers.add(customer);
		
		
		customer=new Customer();
		customer.setId(9);
		customer.setName("Sanjna");
		customer.setAddress("kolhapur");
		cal.set(1994, 01, 30); // Assumes MM/dd/yyyy
	    customer.setDob(cal.getTime());
	    customer.setGender("F");
		customers.add(customer);
		
		
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomers(Customer customer) {
		customers.add(customer);
	}

}
