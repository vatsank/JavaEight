package com.training.optional;

import java.util.Optional;

public class OptionalReturn {

	public static Object getStringObject(int key)
	{
		 switch (key) {
		case 1:
			
			return new String("Vannila String");
		case 2:
			return new StringBuffer("Buffer String");
		case 3:
			return new StringBuilder("Builder String");
		default:
			return null;
		}
		 
	}
	public static void main(String[] args) {
	
		 Optional<Object> obj = Optional.ofNullable(getStringObject(2));
		 
		 Object strType=   obj.orElse("Invalid Choice");
		 
		 System.out.println("String :="+strType.toString());
		 
		obj.ifPresent((o)->{System.out.println( o.toString().toUpperCase() );});
		
		
if(obj.isPresent())
{
	System.out.println("Value is present");
}
else
{
	 System.out.println("Value is absent");
}
		
		  
	}
}
