package com.card;

public class HDFCCard implements ATMCard{

	@Override
	public void balanceEnquiry() {
		System.out.println("Balance enquiry of HDFC account");
		
	}

	@Override
	public void pinChange() {
		System.out.println("Pin change of HDFC accounbt");
		
	}

	@Override
	public void creditMoney() {
		System.out.println("Money credited in HDFC account");
		
	}

	@Override
	public void debitMoney() {
		System.out.println("Money debited from HDFC account");
		
	}
	

}
