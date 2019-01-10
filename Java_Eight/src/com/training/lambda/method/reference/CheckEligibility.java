package com.training.lambda.method.reference;
import com.training.domains.Employee;

public class CheckEligibility {

 public static boolean isEmployeeEligible(Employee emp){
	 
	return  (emp.getBaseSalary() +emp.getBonus())  > 10000;
 }
 
   }
    
