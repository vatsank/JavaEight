package com.training.lambda.method.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.training.domains.Employee;

public class StaticMethodReference {

	public static void main(String[] args) {
		
  	    List<Employee> list = Arrays.asList(new Employee("Ramesh",7000,5000),new Employee("Suresh",6000,4000));

  		Function<Employee,Boolean> reference = CheckEligibility::isEmployeeEligible;  
  		

  		 for(Employee emp:list){
  			boolean result = reference.apply(emp);
  			 
  			if(result){
  			System.out.println(emp + "Is Eligible");
  			}
  		 }
	}
}
	