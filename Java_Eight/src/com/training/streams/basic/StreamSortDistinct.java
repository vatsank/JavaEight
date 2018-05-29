package com.training.streams.basic;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;

import com.training.domains.Customer;
import com.training.utils.HandleCustomers;

public class StreamSortDistinct {

	public static void main(String[] args) {
		
        List<Customer> customerList = HandleCustomers.getCustomers();

        
//        List<Long> custIds = customerList.stream().map(e -> e.getCustomerId()).distinct().collect(toList());
//
//        List<Customer> sortedList = customerList.stream().sorted().collect(toList());
//        
//        sortedList.forEach(System.out::println);
//            
//        List<Customer> revrseList = customerList.stream().sorted(Comparator.reverseOrder()).collect(toList());
//
//        revrseList.forEach(System.out::println);
        
        
		List<Customer> slist = customerList.stream().sorted(Comparator.comparing(Customer::getCustomerId)).collect(toList());
		
		slist.forEach(System.out::println);
        

		
		List<Customer> idThenPhone = customerList.stream().sorted(Comparator.comparing(Customer::getCustomerId).thenComparing(Customer::getPhoneNumber)).collect(toList());
		
		slist.forEach(System.out::println);

		Comparator<Customer> custNameComparator
		= Comparator.comparing(Customer::getCustomerName);
		

		Comparator<Customer> custComparator_nullLast
		= Comparator.nullsLast(custNameComparator);
		

        List<Customer> listWithNull = customerList.stream().
        		                  sorted(Comparator.comparing(Customer::getCustomerName,Comparator.nullsFirst(String::compareTo))).collect(toList());
		

        listWithNull.forEach(System.out::println);
        

        List<Customer> listNullLast = customerList.stream().
                sorted(Comparator.comparing(Customer::getCustomerName,Comparator.nullsLast(String::compareTo))).collect(toList());




listNullLast.forEach(System.out::println);


	  }

	

}
