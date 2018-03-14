package com;

//changing no. of arguments
class Adder{
	
	int add(int n1, int n2) {
		return n1+n2;
	}
	
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		Adder test = new Adder();
		System.out.println("Add of two no=" + test.add(1,2));
		System.out.println("Add of three no=" + test.add(1,2,3));
	}

}
