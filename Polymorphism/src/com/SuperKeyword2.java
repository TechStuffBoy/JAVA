package com;

class Anim {

	void eat() {
		System.out.println("Eating...");
	}
}

class Cat extends Anim {
	
	void eat(){
		System.out.println("eating bread...");
	} 
	
	void bark(){ 
		System.out.println("barking...");
	}  
	
	void work(){
		super.eat(); //used to access Anim eat method
		bark();
	}
}

public class SuperKeyword2 {

	public static void main(String[] args) {
		Cat d = new Cat();
		d.work();
	}

}
