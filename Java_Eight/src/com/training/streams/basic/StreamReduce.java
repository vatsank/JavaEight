package com.training.streams.basic;

import java.util.List;

import com.training.domains.Customer;
import com.training.utils.HandleCustomers;

public class StreamReduce {

	public static void main(String[] args) {
		
		
		
        List<Customer> customerList = HandleCustomers.getCustomers();

	    Long totalSalaryExpense = customerList.stream()
                .map(cust -> cust.getPhoneNumber()).reduce(0L,(a,b) -> a+b);
System.out.println("Total salary expense: "+totalSalaryExpense);

	}

}

//Optional<Employee> maxSalaryEmp=employeeList.stream()
//.reduce((Employee a, Employee b) -> a.getSalary() < b.getSalary() ? b:a);
//if(maxSalaryEmp.isPresent())
//System.out.println("Employee with max salary: "+maxSalaryEmp.get());
//}