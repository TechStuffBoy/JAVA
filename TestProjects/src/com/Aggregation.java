package com;

class Operation {
	
	int square(int n) {
		return n*n;
	}
}

class Circle {
	
	Operation op;
	double pi=3.14;
	
	double area(int radius) {
		int rsquare = 0;
		op = new Operation();
		rsquare = op.square(radius);
		return rsquare*pi;
		
	}
}

public class Aggregation {

	public static void main(String[] args) {
		Circle circle = new Circle();
		double result = circle.area(5);
		System.out.println(result);
	}

}
