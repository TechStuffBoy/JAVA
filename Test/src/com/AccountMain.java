package com;

public class AccountMain {
	static Account nandhu = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nandhu = new Account();
		nandhu.addAccountDetails((long)123456, "Nandhu", 5000.0f);
		nandhu.displayAccountInfo();
		nandhu.deposit(100.0f);
		nandhu.displayAccountInfo();
		nandhu.withdraw(3200.0f);
		nandhu.displayAccountInfo();
		nandhu.withdraw(3200.0f);
		nandhu.deposit(100000.0f);
		nandhu.withdraw(3200.0f);
		nandhu.displayAccountInfo();
	}

}
