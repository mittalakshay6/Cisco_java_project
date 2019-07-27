package main.java.resource;

import java.util.ArrayList;
import java.util.List;

import main.java.constant.ProductType;
import main.java.domain.Product;

public class ProductResource {

		List<Product> products=new ArrayList<>();
		
		public ProductResource() {
		
			Product product=new Product();
			product.setProductId(1);
			product.setProducrtName("Veg McMuffin");
			product.setProductPrice(50);
			product.setType(ProductType.Veg.toString());
			products.add(product);
			
			product=new Product();
			product.setProductId(2);
			product.setProducrtName("Veg Supreme McMuffin");
			product.setProductPrice(50);
			product.setType(ProductType.Veg.toString());
			products.add(product);
			
			product=new Product();
			product.setProductId(3);
			product.setProducrtName("McEgg");
			product.setProductPrice(50);
			product.setType(ProductType.NonVeg.toString());
			products.add(product);
			
			product=new Product();
			product.setProductId(4);
			product.setProducrtName("Egg & Cheese McMuffin");
			product.setProductPrice(50);
			product.setType(ProductType.Veg.toString());
			products.add(product);
			
			
			product=new Product();
			product.setProductId(5);
			product.setProducrtName("Sausage McMuffin");
			product.setProductPrice(50);
			product.setType(ProductType.Veg.toString());
			products.add(product);
			
			product=new Product();
			product.setProductId(6);
			product.setProducrtName("Sausage McMuffin with Egg");
			product.setProductPrice(50);
			product.setType(ProductType.Veg.toString());
			products.add(product);
			
			
			product=new Product();
			product.setProductId(7);
			product.setProducrtName("McAloo Tikki");
			product.setProductPrice(50);
			product.setType(ProductType.Veg.toString());
			products.add(product);
			
			
			product=new Product();
			product.setProductId(8);
			product.setProducrtName("McVeggie");
			product.setProductPrice(50);
			product.setType(ProductType.Veg.toString());
			products.add(product);
			
			product=new Product();
			product.setProductId(9);
			product.setProducrtName("McSpicy Paneer");
			product.setProductPrice(50);
			product.setType(ProductType.Veg.toString());
			products.add(product);
		}

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}
	
		
	
}
