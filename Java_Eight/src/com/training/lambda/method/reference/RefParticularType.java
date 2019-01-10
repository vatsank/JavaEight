package com.training.lambda.method.reference;

public class RefParticularType {

    private static void printInterest(InterestCalculator calculator,MyInterface iface, double rateOfInt){
        double amount =iface.print(calculator, rateOfInt);
        System.out.println(amount);
    }

    public static void main(String[] args) {
		
    	printInterest(new InterestCalculator(4000.00),InterestCalculator::fixedDeposit,0.7);
    
    	printInterest(new InterestCalculator(4000.00),InterestCalculator::jewelLoan,0.7);
    	

	}
    
}
