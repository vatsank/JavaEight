package com.training.local;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class LocalizationExample {

	public static void main(String[] args) {
		
		Locale locales[] = NumberFormat.getAvailableLocales(); 
	
		Consumer<Locale[]> localeList = (loc)->{
						
			List<Locale> list = Arrays.asList(loc);
			
			list.stream().forEach(System.out::println);
		};
		
		  localeList.accept(locales);
	}
}
