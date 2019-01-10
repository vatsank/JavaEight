package com.training.lambda.method.reference;

public class InterestCalculator {

    private double amount;
   

    public InterestCalculator(double amount) {
		super();
		this.amount = amount;
	}

    public double fixedDeposit(double rateOfInt){
        return amount * rateOfInt;
    }
   
    public double jewelLoan(double rateOfInt){
    	
    	return amount * rateOfInt + 100;
    }
}
