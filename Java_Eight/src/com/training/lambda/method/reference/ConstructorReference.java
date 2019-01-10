package com.training.lambda.method.reference;
import java.util.*;
import java.util.function.Function;

public class ConstructorReference {

	private static List findSquareRoot(List<Integer> list, Function<Double, Double> constFunc){
	    List<Double> result = new ArrayList<>();
	    list.forEach(x -> result.add(constFunc.apply(Math.sqrt(x))));
	    return result;
	}

	public static void main(String[] args) {
	
		List<Integer>  numbers = Arrays.asList(4,9,16,25,36);
	    List<Integer> squaredNumbers = ConstructorReference.findSquareRoot(numbers,Double::new);
	    
	    System.out.println(squaredNumbers);

	}
    


}
