package com;

class Animals{
	void eat() {
		System.out.println("Animals will eat..");
	}
}

class Dogs extends Animals {
	
	void dog() {
		System.out.println("Dogs will bark..");
	}
}

class BabyDog extends Dogs {
	void baby() {
		System.out.println("Baby dogs will cry..");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog baby = new BabyDog();
		baby.baby();
		baby.dog();
		baby.eat();
	}

}
