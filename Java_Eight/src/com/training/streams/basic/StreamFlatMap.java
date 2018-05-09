package com.training.streams.basic;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.training.domains.Customer;
import com.training.utils.HandleCustomers;

public class StreamFlatMap {

	public static void main(String[] args) {
		
        List<Customer> customerList = HandleCustomers.getCustomers();

//		  List<String> nameCharList = customerList.stream().map(cust-> cust.getCustomerName().split(""))
//		           .flatMap(array->Arrays.stream(array))
//		           .map(str -> str.toUpperCase()) 
//		           .filter(str -> !(str.equals(" ")))
//		           .collect(toList());
//		   nameCharList.forEach(str -> System.out.print(str));
	  }

	

}
