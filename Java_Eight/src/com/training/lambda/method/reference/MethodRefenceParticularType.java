package com.training.lambda.method.reference;

import java.util.Arrays;

public class MethodRefenceParticularType {

	public static void main(String[] args) {

		String[] stringArray = { "Yash", "balu", "Mani", "anand" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);

   for(String eachName : stringArray){
	   System.out.println(eachName);
   }

	}

}
