package com.card;

public class SBICard implements ATMCard{

	@Override
	public void balanceEnquiry() {
		System.out.println("Balance enquiry of SBI card");
		
	}

	@Override
	public void pinChange() {
		System.out.println("Pin change of SBI card");
		
	}

	@Override
	public void creditMoney() {
		System.out.println("Money credited in SBI account");
		
	}

	@Override
	public void debitMoney() {
		System.out.println("Money debited from SBI account");
		
	}
	
	

}
