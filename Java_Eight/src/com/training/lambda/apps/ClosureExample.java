package com.training.lambda.apps;

public class ClosureExample {


	public static Runnable create(){
		String name ="Ramesh";
		Runnable thread1 = ()->{
			System.out.println("Name" +name);
			
		};
		return thread1;
	}

	public static void main(String[] args) {
		
		Runnable thread = create();
		
		thread.run();
		
	}
}
