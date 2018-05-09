package com.training.lambda.apps;

import java.util.function.BiFunction;
import java.util.function.Function;



public class UseInstanceMethodReference {

	public static void main(String[] args) {
	
		InstranceMethodReference ref = new InstranceMethodReference();
		
		 BiFunction<Integer,Integer,Double> cal = ref::addition;
		 
		 System.out.println(cal.apply(4, 5));

	}

}
