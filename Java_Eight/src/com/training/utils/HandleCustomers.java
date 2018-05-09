package com.training.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.training.domains.Customer;

public class HandleCustomers {

	public static List<Customer> getCustomers(){
		
		   List<Customer> customerList = new ArrayList<>();
		   
		          customerList.add(new Customer(101,"Ramesh", 9454562L));
		          customerList.add(new Customer(102,"Anand", 8454562L));
		          customerList.add(new Customer(210,"Deepak", 967454562L));
		          customerList.add(new Customer(212,"Chand", 73454562L));
		           
		          
		    return customerList;
	}
	
	public static List<String> getCustomerNames(){
		
		List<Customer> customerList = getCustomers();
		
		List<String> nameList = customerList.stream().map(customer -> customer.getCustomerName()).collect(Collectors.toList());
				

		 return nameList;
	}
}
