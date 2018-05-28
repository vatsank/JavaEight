package com.training.optional;

import java.util.Optional;

public class OptionalExample {

	
	public static void main(String[] args) {

		String[] names = new String[10];
		
		
		Optional<String> checkNull = Optional.ofNullable(names[4]);
		
		if(checkNull.isPresent())
		{
			System.out.println(checkNull.get());
		}
		else
		{
			System.out.println("No Such Element");
		}
        
		checkNull.ifPresent(System.out::println);

		
		
	}

}
