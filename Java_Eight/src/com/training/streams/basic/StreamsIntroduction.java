package com.training.streams.basic;

import com.training.domains.Customer;
import com.training.utils.HandleCustomers;

import java.util.*;
import static java.util.stream.Collectors.toList;

public class StreamsIntroduction {

public static void main(String args[]){

         List<Customer> customerList = HandleCustomers.getCustomers();
         
	List<Customer> filteredList = customerList.stream().limit(2).collect(toList());
	
           filteredList.forEach(System.out::println);
} 

}
