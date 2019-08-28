package com.card;

public class ATMMachine {

	
	
	public void insertCard(ATMCard card)
	{
		card.balanceEnquiry();
		card.pinChange();
		card.creditMoney();
		card.debitMoney();
	}
	
	public static void main(String[] args) {
		
		SBICard sbicard=new SBICard();
		HDFCCard hdfccard=new HDFCCard();
		
		
		ATMMachine atmmachine=new ATMMachine();
		atmmachine.insertCard(sbicard);
		
		System.out.println("-------------------------------------------------------");
		System.out.println();
		
		atmmachine.insertCard(hdfccard);
	}

}
