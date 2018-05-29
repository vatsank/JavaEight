package com.training.streams.basic;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.domains.Customer;
import com.training.utils.HandleCustomers;

import static java.util.stream.Collectors.toList;

public class FilteringAndSlicing {

	public static void main(String[] args) {
	
		List<Customer> customerList = HandleCustomers.getCustomers();

		

		
		Map<Long, String> map = customerList.stream()
				.collect(Collectors.toMap(Customer::getPhoneNumber, Customer::getCustomerName));
		
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));		
	
					
		  List<Long> phoneBook = customerList.stream().map((eachCust)->eachCust.getPhoneNumber()).collect(toList());
		  
		         phoneBook.forEach(System.out::println);
		         
		         
		   List<Customer> filteredList= customerList.stream().filter((Customer cust ) -> cust.getCustomerId() >200).collect(toList());
				   
		   System.out.println("After applying filter method");
		   filteredList.forEach(System.out::println);
		   //distinct method
		   filteredList= filteredList.stream().distinct().collect(toList());
		   System.out.println("After applying distinct() method");
		   filteredList.forEach(System.out::println);
		   //limit method
		   filteredList= filteredList.stream().limit(2).collect(toList());
		   System.out.println("After applying limit(2) method");
		   filteredList.forEach(System.out::println);
		   //skip method
		   filteredList= filteredList.stream().skip(1).collect(toList());
		   System.out.println("After applying skip(1) method");
		   filteredList.forEach(System.out::println);

	}
    
}
