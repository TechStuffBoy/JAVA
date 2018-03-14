package com;


class A {
	
	A get() {
		return this;
	}
}

class A1 extends A{
	
	A1 get() {
		return this;
	}
	
	void message() {
		System.out.println("welcome to covariant return type");
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		A1 test = new A1();
		test.get().message();
	}

}
