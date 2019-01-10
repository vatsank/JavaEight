package com.training.lambda.apps;
import  java.util.function.*;
public class PredicateExample2 {

	public static void main(String[] args) {
		
		Predicate<String> startsWithA = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
			
				return t.startsWith("A");
			}
		};
					
       boolean isItStartingWithA = startsWithA.test("Anand");
       
       Predicate<String> testWithLambda = (name)->name.startsWith("A");
       
        System.out.println(testWithLambda.test("Anand"));
       
	}
}
