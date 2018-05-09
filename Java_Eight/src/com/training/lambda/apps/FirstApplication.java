package com.training.lambda.apps;
import com.training.lambda.ifaces.*;
import java.util.ArrayList;
import java.util.function.Consumer;



public class FirstApplication {

	public static void main(String[] args) {
		
		
		Greeting grt =()->{
		
			System.out.println("I Know Java 8 ");
			
		};
		
	        grt.show();
	        
	        
	        ArrayList<String> namesList=new ArrayList<String>();
	        
	        namesList.add("Ramesh");
	        namesList.add("Rajesh");
	        namesList.add("Rakesh");
	        namesList.add("Rangesh");
	        
	        namesList.forEach(System.out::println);
	        
	       
	        
	        Converter conv =(double dlr)->{return dlr * 50.00;};
	        
	        System.out.println(conv.convert(450));
	        
	        
	        
	        
	}
}
