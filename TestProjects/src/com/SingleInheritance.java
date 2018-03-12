package com;

class Animal {
	
	void eat() {
		System.out.println("Animals will eat flesh..");
	}
}

class Dog extends Animal {
	
	void bark() {
		System.out.println("Dog will bark...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog puppy = new Dog();
		puppy.eat();
		puppy.bark();
	}

}
