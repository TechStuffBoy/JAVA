package com;

// If you make any method as final, you cannot override it.
class Car {
	final void run() {
		System.out.println("Bike will run..");
	}
}

class Honda extends Car {
	//cant over ride the final method
	void run() {
		System.out.println("Honda also can run..");
	}
}

public class FinalKeyword2 {

	public static void main(String[] args) {
		Honda test = new Honda();
		test.run();
	}

}
