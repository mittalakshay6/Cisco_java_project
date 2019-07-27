package test.main.java;



import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.constant.OrderType;
import main.java.controller.StatisticsController;
import main.java.domain.Product;
import main.java.pojo.OnlineOfflineProduct;
import main.java.pojo.OrderTime;
import main.java.pojo.Result;
import main.java.resource.CustomerResource;
import main.java.resource.OnlineOrderResource;

class TestOnlineOfflineSystem {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		deliveryOrdersOnline=new ArrayList<>();
		deliveryOrdersOnline.add("{\r\n" + 
				"	\"customerId\": 1,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 1,\r\n" + 
				"		\"productQuntity\": 4\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 2,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}]\r\n" + 
				"}");
		
		deliveryOrdersOnline.add("{\r\n" + 
				"	\"customerId\": 4,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 3,\r\n" + 
				"		\"productQuntity\": 3\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 4,\r\n" + 
				"		\"productQuntity\": 4\r\n" + 
				"	}]\r\n" + 
				"}");
		
		
		deliveryOrdersOnline.add("{\r\n" + 
				"	\"customerId\": 4,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 5,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 6,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}]\r\n" + 
				"}");
		
		
		
		deliveryOrdersOnline.add("{\r\n" + 
				"	\"customerId\": 4,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 7,\r\n" + 
				"		\"productQuntity\": 4\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 8,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}]\r\n" + 
				"}");
		
		
		
		deliveryOrdersOnline.add("{\r\n" + 
				"	\"customerId\": 4,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 9,\r\n" + 
				"		\"productQuntity\": 4\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 1,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}]\r\n" + 
				"}");
		
		
		
		deliveryOrdersOnline.add("{\r\n" + 
				"	\"customerId\": 4,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 1,\r\n" + 
				"		\"productQuntity\": 1\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 2,\r\n" + 
				"		\"productQuntity\": 2\r\n" + 
				"	}]\r\n" + 
				"}");
		
		
		
		
		deliveryOrdersOnline.add("{\r\n" + 
				"	\"customerId\": 4,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 5,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 8,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}]\r\n" + 
				"}");
		
		
		deliveryOrdersOffline.add("{\r\n" + 
				"	\"customerId\": 8,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 5,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 8,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}]\r\n" + 
				"}");
		
		
		deliveryOrdersOffline.add("{\r\n" + 
				"	\"customerId\": 3,\r\n" + 
				"	 \r\n" + 
				"	\"mobileNumber\": 1234567890,\r\n" + 
				"	\"deliveryAddress\": \"dsfsdf sfsdfcsdfds\",\r\n" + 
				"	\"pincode\": \"sdfsdfsdf\",\r\n" + 
				"	\"email\": \"graut@nicesoftwaresolutions.com\",\r\n" + 
				"	\"orders\": [{\r\n" + 
				"		\"productId\": 5,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}, {\r\n" + 
				"		\"productId\": 8,\r\n" + 
				"		\"productQuntity\": 5\r\n" + 
				"	}]\r\n" + 
				"}");
		
		for (CutomerDeliveryInformation customerDeliveryInformation : deliveryOrdersOnline) {
			   onlineOrderResource.orderInBetween8TO10(customerDeliveryInformation,OrderType.Online.toString());
		   }
		
		for (String customerDeliveryInformation : deliveryOrdersOnline) {
			   onlineOrderResource.orderInBetween8TO10(customerDeliveryInformation,OrderType.OffLine.toString());
		   }
		
	}

	

	static OnlineOrderResource onlineOrderResource=new OnlineOrderResource();
	static List<String> deliveryOrdersOnline=new ArrayList<>();
	static List<String> deliveryOrdersOffline=new ArrayList<>();
	
	
   
 
   //	1.	Get all customer list from temporary storage (Collection) .
   @Test
   public void testGetAllCustomerList () {

	   CustomerResource customerResource=new CustomerResource();
	   Assertions.assertEquals(9, customerResource.getCustomers().size());
	   Assertions.assertTrue(customerResource.getCustomers().size()>0);
	   
   }
  
   //2.	Get only online Order from customer who is ordering in between 8am to 10am. 
     @Test
	   public void testGetOnlineOrder() {
	 
		   
		   Result result=new Result();
		   
		   for (String customerDeliveryInformation : deliveryOrdersOnline) {
			   result=onlineOrderResource.orderInBetween8TO10(customerDeliveryInformation,OrderType.Online.toString());
		   }
		   
		   Assertions.assertEquals(200, result.getCode());
		   
	   }
     
     //3.	Get online and offline order from customer from 10 am to 10 pm. 
  
     @Test
	   public void testGetOfflineOrder() {
	 
    	 	Result result=new Result();
		   for (String customerDeliveryInformation : deliveryOrdersOffline) {
			   result=onlineOrderResource.orderInBetween10TO10(customerDeliveryInformation,OrderType.OffLine.toString());
		   }
		   
		   Assertions.assertEquals(200, result.getCode());
		  
		   
	   }
     
     
     //     4.	Get statistic of each hour�s order.
     
     @Test
	   public void getEachHorsStatastics() {
	 
    	 StatisticsController statisticsController=new StatisticsController();
    	 OrderTime orderTime=(OrderTime) statisticsController.getStatisticOnHoursBasis();
    	 assumeTrue(!orderTime.getOrder10to11().isEmpty());
    	 assumeFalse(orderTime.getOrder10to11().isEmpty());
    	    
	   }
     
     
     //5.	Get statistics how many women and men order on particular time.
     @Test
	   public void getEachHorsOrderMenAndWomen() {
	 
	  	 StatisticsController statisticsController=new StatisticsController();
	  	 List<OrderTime> orderTime= (List<OrderTime>) statisticsController.getStatisticOnMenWoMenHoursBasis();
	  	assumeTrue(orderTime.size()>0);
	   }
      
     //6.	Get statistic on product what they ordered
     @Test
	   public void getstatisticOnProduct() {
	 
	  	 StatisticsController statisticsController=new StatisticsController();
	  	List<Product> product= (List<Product>) statisticsController.getStatisticOnOrderProduct();
	  	assumeTrue(product.size()>0);
	   }
     
     //7.	Get statistic on online and offline ordered.
     @Test
	   public void getstatisticOnOnlineOfflineCustomer() {
	 
	  	StatisticsController statisticsController=new StatisticsController();
	  	List<OnlineOfflineProduct> onlineOfflineProduct= (List<OnlineOfflineProduct>) statisticsController.getStatisticOnOnlineOfflineOrder();
	  	assumeTrue(onlineOfflineProduct.size()>0);
	   }
     
     
   
  
}
