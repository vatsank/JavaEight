package com.training.local;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class UseLocaleSenstiveClasses {

	 private static long salary =2345000;
	 
	 public static void numberFormat(){
		 
		    NumberFormat numberFormatDefault = NumberFormat.getInstance();
			System.out.println("Salary - Default Locale: "+numberFormatDefault.format(salary));
			
			NumberFormat numberFormatLocale = NumberFormat.getInstance(Locale.GERMAN);
			System.out.println("Salary - German Locale: "+numberFormatLocale.format(salary));
			
	 }
	 
	 public static void currencyFormat(){
		 
		
			NumberFormat numberFormatDefaultCurrency = NumberFormat.getCurrencyInstance();
			System.out.println("Currency Format using Default Locale: "+numberFormatDefaultCurrency.format(salary));
			
			NumberFormat numberFormatLocaleCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);
			System.out.println("Currency Format using ITALY Locale: "+numberFormatLocaleCurrency.format(salary));
	
	 }
	 
	 public static void dateFormat(){
		 
		
		 LocalDate date =LocalDate.of(2008, 2, 12);
			

	        Locale delocale = Locale.GERMANY;
	        
			Locale uklocale = Locale.UK;
			
			DateTimeFormatter ukformat = DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL ).withLocale ( uklocale );
	              
					System.out.println(ukformat.format(date));
					
					DateTimeFormatter deformat = DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL ).withLocale ( delocale );
		              
					System.out.println(deformat.format(date));
					

	 }
	public static void main(String[] args) {

						
						
currencyFormat();
		

	}

}
