package com.training.lambda.apps;
import java.util.*;
import java.util.function.Predicate;

import com.training.domains.Customer;
import com.training.lambda.ifaces.CreateCustomer;
import com.training.lambda.ifaces.Greeting;
import com.training.lambda.ifaces.HandleNames;
import com.training.lambda.ifaces.ShowCustomerDetails;
import com.training.utils.HandleCustomers;
public class LambdaExpression {

	List<String> namList =null;
	
	public LambdaExpression(){
		
		namList = HandleCustomers.getCustomerNames();
				
	}
	
	public  void booleanLambda(){
			
		
        List<String> nameList = HandleCustomers.getCustomerNames();
        
		HandleNames showSize =(list) -> list.isEmpty();

		System.out.println("Is Name List Empty :="+showSize.isNameEmpty(nameList));
			
	}
	
	public void consumeObject(Customer cust){
		
		ShowCustomerDetails details = (custObj) -> custObj.toString();
		
		System.out.println(details.show(cust));
		
	}
	
	public void sortCustomers(List<Customer> custList)
	{
		 custList.sort((Customer c1, Customer c2)->c1.getCustomerName().compareTo(c2.getCustomerName()));
		 
		 System.out.println(custList);
		 
		 
	}
	public static void main(String[] args) {
	
		LambdaExpression exp = new LambdaExpression();
		
		exp.booleanLambda();
		
		

		 CreateCustomer custFactory = ()->new Customer(901,"Harish",89999);
		 
		 Customer cust = custFactory.createCustomer();
		
		  exp.consumeObject(cust);;
				 
				exp.sortCustomers(HandleCustomers.getCustomers());
	}

}
