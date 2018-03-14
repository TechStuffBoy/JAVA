package com;

class Add {
	int add(int n1, int n2) {
		return n1+n2;
	}
	
	double add(double n1, double n2) {
		return n1+n2;
	}
}
public class MethodOverloading2 {

	public static void main(String[] args) {
		Add test = new Add();
		System.out.println("Add int=" + test.add(2, 4));
		System.out.println("Add double=" + test.add(2.3, 34.6));
	}

}
