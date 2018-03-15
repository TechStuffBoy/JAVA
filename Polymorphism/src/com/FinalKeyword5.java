package com;


class Bike1 {
	private final int speedLimit;
	
	Bike1(int x) {
		speedLimit = x;
		System.out.println("SpeedLimit = " + speedLimit);
	}
}
public class FinalKeyword5 {

	public static void main(String[] args) {
		Bike1 test1 = new Bike1(10);
		Bike1 test2 = new Bike1(200);
	}

}
