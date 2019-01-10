package com.training.lambda.method.reference;
import java.util.*;
import java.util.function.*;

public class InstanceMethodRefrence {

    

public static void main(String[] args) {
	

	
FirstExample ex = new FirstExample();

       Function<Double,Double> reference = ex::invoke;
       
         double result = reference.apply(200.00);
         
         System.out.println(result);
         
       
}
}
