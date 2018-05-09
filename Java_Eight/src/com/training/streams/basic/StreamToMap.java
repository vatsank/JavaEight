package com.training.streams.basic;

import java.util.*;
import java.util.List;
import static java.util.stream.Collectors.toList;

import com.training.domains.Customer;
import java.util.logging.*;
import java.util.stream.Stream;
public class StreamToMap {

	public static void main(String[] args) {

		Logger log = Logger.getAnonymousLogger();
		
		  List<Customer> customerList = new ArrayList<>();
		  
		  customerList.add(new Customer(102,"Ramesh", 9454562L));
		  customerList.add(new Customer(101,"Suresh", 7454562L));
		  customerList.add(new Customer(103,"Ganesh", 8454562L));
		  customerList.add(new Customer(104,"Vikas", 94445889L));
		  
		   
		   List<String> mappedList = customerList.stream().
                   map(Customer::getCustomerName).collect(toList());

		    mappedList.forEach(log::info);

		    Stream<String> streamBuilder = Stream.<String>builder().add("anand").add("baskar").add("charu").build();

		     streamBuilder.forEach(log::info);
		     
		     Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		     
		     streamGenerated.forEach(log::info);
		     
		     Stream<Integer> streamIterated = 
	                  Stream.iterate(40, n -> n + 2).limit(20);

		     streamIterated.forEach(System.out::println);
	}

}


