package com.training.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolDemo {

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool(2);
		System.out.println(pool);
		Task task = new Task();   //runnable
		pool.invoke(task);   
		
		System.out.println(pool);
		
		
		System.out.println(pool.getActiveThreadCount());

	}

}
