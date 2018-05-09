package com.training.streams.basic;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {
		
		int[] array = {23,43,56,97,32};
		 
		Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
		  
	
		OptionalInt  sum = Arrays.stream(array).parallel().reduce(Integer::sum);
		System.out.println(sum.getAsInt());
		  
    	  //Set start value. Result will be start value + sum of array. 
    	  int startValue = 100;
    	 
    	  int sum2 = Arrays.stream(array).parallel().reduce(startValue, Integer::sum);
    	  System.out.println(sum2);
    	  
    	//Here result will be 3*2 + 3*3 + 3*4 that is 18. 
    	  
    	  Integer arrSum = Stream.of(2,3,4).parallel().reduce(2, (x,y)->x+y, (p,q)->{
           
              return p+q;
          });
          System.out.println(arrSum);
	}
	 

}
