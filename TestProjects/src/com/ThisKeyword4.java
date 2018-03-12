package com;

//this: to pass as an argument in the method
class A {
	
	
	A(int x) {
		System.out.println("Hello x=" + x);
	}
	A() {
//		this(5); // We can achieve by using like this
		System.out.println("Hello A");
	}
	
	
	void m(A obj) {
		System.out.println("M method is invoked");
	}
	
	void p() {
//		m(this(2)); //wrong
		m(this);
		
	}
	
}
public class ThisKeyword4 {

	public static void main(String[] args) {
		A a = new A();
		a.p();
	}

}
