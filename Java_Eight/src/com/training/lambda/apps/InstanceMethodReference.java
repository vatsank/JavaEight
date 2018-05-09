package com.training.lambda.apps;

public class InstanceMethodReference {

	public  boolean isEven(int number)
	  {
		  return number %2 == 0;
	  }
	


		public static void main(String[] args) {
		
			Predicate obj = EvenOddCheck::isEven;
			 
			System.out.println(obj.test(25));
		}
		 

}
