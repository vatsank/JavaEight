package com.training.streams.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.training.domains.Customer;
import com.training.domains.Order;
import com.training.domains.Product;
import com.training.utils.HandleCustomers;

public class ExampleFlatMap {

	public static void main(String[] args) {

		
		HashSet<Order> orderBook = new HashSet<>();
		
		Set<Product> prdList = new HashSet<>();
		
		prdList.add(new Product(101,"tv",4000));
		prdList.add(new Product(102,"led",5000));
		prdList.add(new Product(101,"fridge",6000));
		
		
		orderBook.add(new Order(701,new Customer(300,"Ram",45500L),prdList));
		orderBook.add(new Order(702,new Customer(300,"Ram",45500L),prdList));

        List<Product> itemList =
        		orderBook.stream().flatMap(x -> x.getItems().stream())     
                         .collect(Collectors.toCollection(ArrayList::new));

        
        
        itemList.forEach(System.out::println);
        
        

              


				
	}

}
