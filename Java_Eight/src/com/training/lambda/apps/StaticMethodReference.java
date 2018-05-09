package com.training.lambda.apps;

interface Predicate {
  boolean test(int n);
}

class EvenOddCheck {

  public static boolean isEven(int number)
  {
	  return number %2 == 0;
  }
}

public class StaticMethodReference {

	public static void main(String[] args) {
	
		Predicate obj = EvenOddCheck::isEven;
		 
		System.out.println(obj.test(25));
	}
	 
	 
}
