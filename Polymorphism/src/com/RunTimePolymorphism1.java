package com;

class Alpha {
	
	void run() {
		System.out.println("Running Alpha..");
	}
}



public class RunTimePolymorphism1 extends Alpha {

	void run() {
		System.out.println("Running RunTimePolymorphism1..");
	}
	
	public static void main(String[] args) {
		Alpha test = new RunTimePolymorphism1(); //upcasting
		test.run();
	}

}
