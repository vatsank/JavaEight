package com.training.lambda.apps;
import java.util.*;
import java.util.function.Function;
public class Example {

	public static void main(String[] args) {
	
		Function<List<Integer>, Integer> maxFn = Collections::max;
		
		
		long maxNumber = maxFn.apply(Arrays.asList(1, 10, 3, 5));
		

		  System.out.println("Maximum Number :="+ maxNumber);
		
  
	
}
	
}
