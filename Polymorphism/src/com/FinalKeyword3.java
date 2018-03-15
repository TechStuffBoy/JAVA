package com;

// If you make any class as final, you cannot extend it.
final class Test {
	void run() {
		System.out.println("Run method..");
	}
}

class Teddy extends Test {
	void run() {
		System.out.println("Run method in Teddy..");
	}
}
public class FinalKeyword3 {

	public static void main(String[] args) {
		Teddy test = new Teddy();
		test.run();
	}

}
