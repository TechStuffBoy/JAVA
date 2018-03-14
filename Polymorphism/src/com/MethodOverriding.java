package com;

class Bank {
	
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	
	int getRateOfInterest() {
		return 8;
	}
}

class BOB extends Bank {
	
	int getRateOfInterest() {
		return 10;
	}
}

class BOI extends Bank {
	
	int getRateOfInterest() {
		return 12;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		BOB bob = new BOB();
		BOI boi = new BOI();
		
		System.out.println("SBI intrest=" + sbi.getRateOfInterest());
		System.out.println("BOB interest=" + bob.getRateOfInterest());
		System.out.println("BOI intrest=" + boi.getRateOfInterest());
	}

}
