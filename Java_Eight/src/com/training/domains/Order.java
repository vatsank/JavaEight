package com.training.domains;

import java.util.Set;

public class Order {

	private long orderId;
	private Customer customer;
	private Set<Product> items;
	
	
	public Order() {
		super();
	}
	
	
	public Order(long orderId, Customer customer, Set<Product> items) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.items = items;
	}


	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Set<Product> getItems() {
		return items;
	}
	public void setItems(Set<Product> items) {
		this.items = items;
	}
	
	
}
