package com.training.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolDemo {

	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool(5);
		
	
		Task task = new Task();   
	
		pool.invoke(task);
	 		System.out.println("Pool" + pool);
		
		System.out.println(pool.getActiveThreadCount());

	}

}
