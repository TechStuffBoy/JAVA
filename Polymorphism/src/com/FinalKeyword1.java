package com;

// Final keyword is like constant
class Bike{
	final int speedLimit = 90;
	
	void run() {
		speedLimit = 400; // Cant change final keyword
	}
}
public class FinalKeyword1 {

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.run();
	}

}
