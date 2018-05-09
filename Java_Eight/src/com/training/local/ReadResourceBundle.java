package com.training.local;

import java.util.Locale;
import java.util.ResourceBundle;

public class ReadResourceBundle {

	public static void main(String[] args) {

		//Locale locale = Locale.FRANCE;
		Locale locale = Locale.ENGLISH;
		 ResourceBundle rb = ResourceBundle.getBundle("MessageResources", locale); 
		
		  System.out.println(rb.getString("morning_greet"));

	}

}
