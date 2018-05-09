package com.training.lambda.apps;
import java.util.function.*;
public class SupplierExample {

	public static void main(String[] args) {

		IntSupplier rollNumber = ()-> {return 45;};
		
              int number = rollNumber.	getAsInt();
              
              System.out.println(number);
	}

}
