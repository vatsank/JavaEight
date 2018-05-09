package com.training.lambda.apps;

import java.util.Arrays;
import java.util.*;
import java.util.function.*;

public class PredicateExample {

	public static List<String> getNames(){
		
		List<String> names = Arrays.asList("Ramesh","Suresh","Rajesh","Ganesh");

		return names;
	}
	
	public static void printNameByCondition(Predicate<String> predicate, List<String> nameList)
	{
		 
		 
		 nameList.forEach((eachName)->{
		    	
		    	// Using the test method implemented earlier as Lambda
		    	
		    	if(predicate.test(eachName))
		    	{
		    		System.out.println(eachName);
		    	}
		    	
		    });
		
	}
	public static void main(String[] args) {
	
		
		// Predicate Interface with test(T) method  is Implemented as Lambda Expression
		        
	    List<String> nameList = getNames();
	    
		
		System.out.println("=========  Print Names Starting With R  =====================");

		
		Predicate<String> startChar= (name) ->{ return name.startsWith("R");};

				printNameByCondition(startChar, nameList);
	

				System.out.println("=========  Print All Names  =====================");
			
		Predicate<String> endingChar = (name) ->{ return name.endsWith("h");};
			
			printNameByCondition(endingChar, nameList);
			
			
	}

}
