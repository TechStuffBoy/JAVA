package com;

class BankClass {
	
	float getROI() {
		return 0;
	}
}

class RBIClass extends BankClass{
	
	float getROI() {
		return 9.2f;
	}
}

class SBIClass extends BankClass{
	
	float getROI() {
		return 9.7f;
	}
}

class BOIClass extends BankClass{
	
	float getROI() {
		return 9.79f;
	}
}


public class RuntimeBank {

	public static void main(String[] args) {
		BankClass b;
		
		b = new RBIClass();
		System.out.println("RBI Interest = " + b.getROI());
		
		b = new SBIClass();
		System.out.println("SBI Interest = " + b.getROI());
		
		b = new BOIClass();
		System.out.println("BOI Interest = " + b.getROI());
	}

}
