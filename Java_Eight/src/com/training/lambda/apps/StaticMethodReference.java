package com.training.lambda.apps;

interface MyPredicate {
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
	
		MyPredicate obj = EvenOddCheck::isEven;
		 
		System.out.println(obj.test(25));
	}
	 
	 
}
