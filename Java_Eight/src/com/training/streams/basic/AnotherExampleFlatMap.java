package com.training.streams.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.training.domains.Vendors;

public class AnotherExampleFlatMap {

	public static void main(String[] args) {
	
		//Converting a Stream with List<String> into a	Stream<String>
		
		List<String> serviceList = new ArrayList<>();
		serviceList.add("Catering");
		serviceList.add("Band");
		serviceList.add("Flowers");
		
		List<Vendors> vendorList = new ArrayList<>();
		
		vendorList.add(new Vendors(899,serviceList));
		
	
		
		//vendorList.stream().flatMap(vendor -> vendor.getServices().stream()).forEach(System.out::println);
		
		

		// Converts the current type Stream<List<String>> elements to another stream of type Stream<String>
		

		List<String> services = vendorList.stream().peek(System.out::println).
				        map(v -> v.getServices()).peek(System.out::println).
				          flatMap(v -> v.stream()).collect(Collectors.toList());
		
		
		  services.forEach(System.out::println);
		
	}

}
