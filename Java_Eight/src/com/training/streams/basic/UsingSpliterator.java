package com.training.streams.basic;

import java.util.List;
import java.util.Spliterator;

import com.training.domains.Customer;
import com.training.utils.HandleCustomers;

public class UsingSpliterator {

	public static void main(String[] args) {

		   List<Customer> custList = HandleCustomers.getCustomers();
		   
	
		    Spliterator<Customer> cust01= custList.spliterator();
	
                 		    
		    System.out.println(cust01.tryAdvance(System.out::println));
		    
		    
		     cust01.forEachRemaining(System.out::println);
		     
	}

}
