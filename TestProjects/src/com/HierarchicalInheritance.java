package com;


class Animalz {
	void eat() {
		System.out.println("Animals will eat..");
	}
}

class Dogz extends Animalz { //Both are Animalz
	
	void dog() {
		System.out.println("Dogs will bark..");
	}
}

class Cat extends Animalz { //Both are Animalz
	void cat() {
		System.out.println("Cat says meow..");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.eat();
		cat.cat();
//		cat.dog(); //CT error
	}

}
