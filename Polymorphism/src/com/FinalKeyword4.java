package com;


// Yes, final method is inherited but you cannot override it. For Example:
class Class {
	
	final void run() {
		System.out.println("This is a run method");
	}
}

public class FinalKeyword4 extends Class{

	public static void main(String[] args) {
		FinalKeyword4 test = new FinalKeyword4();
		test.run();
	}

}
