package com.training.optional;

import java.util.Optional;

public class OptionalBankAccount {

	public static void main(String[] args) {
	
	
		BankAccount regAccount = new BankAccount(200,"Ramesh",null);
		
		   Optional<Double> regAcHasOD = Optional.ofNullable(regAccount.getOverDraft());

	      regAccount.setOverDraft(regAcHasOD.orElse(4500.00));
         
			System.out.println(regAccount);

	
	  BankAccount salAccount = new BankAccount(201,"Rajesh",2000.00);

	  Optional<Double> salAcHasOD = Optional.ofNullable(salAccount.getOverDraft());

	  salAccount.setOverDraft(salAcHasOD.orElse(4500.00));

		System.out.println(salAccount);
		
		
	
	}

}
