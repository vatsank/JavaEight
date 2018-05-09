package com.training.forkjoin;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class FrkJoinApplication {

	public static void main(String[] args) {
		// to calculate 11th element of Fibonacci Series

	 
		 	
		  Fibonacci fibonacci = new Fibonacci(25);
	        ForkJoinPool pool = new ForkJoinPool(4);
	     
	    
	        System.out.println(pool.invoke(fibonacci));

		
	       // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 
	}

}
