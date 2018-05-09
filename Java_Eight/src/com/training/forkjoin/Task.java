package com.training.forkjoin;

import java.util.concurrent.RecursiveAction;

public class Task extends RecursiveAction {

	@Override
	protected void compute() {
		   System.out.println("Inside Compute method");
              
		
	}

}
