package com.training.domains;
import java.util.*;

public class OrderService {

	
	public List<Customer> getCustomerList(){
		
		List<Customer> custList = new ArrayList<>();
		
		custList.add(new Customer());
		
		return custList;
	}
	
	public Set<Product> getProducts(){
		
		Set<Product> productList = new HashSet<>();

		productList.add(new Product());

		return productList;
	}
	 
	public List<Order> getOrders(){
	
		List<Order> orderList = new ArrayList<>();
		
		orderList.add(new Order());
		
		return orderList;
	}
	
	public Map<Customer,List<Order>> getOrderByCustomer(){
		
		Map<Customer,List<Order>> ordByCustomer = new HashMap<>();
		
		return ordByCustomer;
	}
}
