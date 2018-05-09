package com.training.lambda.apps;

import com.training.lambda.ifaces.DisplayGreeting;

public class UsingThisInLambda {

	    String value="Greeting";
	     
	    public DisplayGreeting createLambdaInterface(){
	    	DisplayGreeting pongalGreeting=()->{
	    		 	    String value="Happy Pongal";
	            return this.value;
	        };
	         
	        return pongalGreeting;
	    }
	public static void main(String[] args) {

		
		UsingThisInLambda obj = new UsingThisInLambda();
		
		DisplayGreeting greet = obj.createLambdaInterface();
		
		System.out.println(greet.showGreeting());
				
	}	
		
	

}
