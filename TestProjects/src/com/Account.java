package com;

public class Account {
	long accountNo;
	String name;
	float amount;
	
	void addAccountDetails(long iAccountNo, 
			String iName, float iAmount) {
		
		accountNo = iAccountNo;
		name = iName;
		amount = iAmount;
	}
	
	void deposit(float iAmount) {
		amount = amount + iAmount;
		System.out.println(iAmount + " " + "Deposited");
	}
	
	void withdraw(float iAmount) {
		if(iAmount > amount) {
			System.out.println("Insufficient Balance");
			System.out.println("Your Balance is " + amount + " USD only" );
		} else {
			amount = amount - iAmount;
			System.out.println(iAmount + " " + "Withdrawn");
		}
	}
	
	void checkBalance() {
		System.out.println("Your Balance is " + amount + " USD only" );
	}
	
	void displayAccountInfo() {
		System.out.println(accountNo + " " + name + " " + amount + " USD");
	}
}
