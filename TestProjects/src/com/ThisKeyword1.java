package com;



class Test {
	int id;
	float fees;
	String name;
	Test(int id, float fees, String name) {
		id = id;
		fees = fees;
		name = name;
		
		System.out.println("Name=" + name + " id=" + id + " fees=" + fees);
	}
	void display() {
		System.out.println("In Display-> Name=" + name + " id=" + id + " fees=" + fees);
		//Because in constructor itself values are not assigned, we need to use this keyword
	}
}

public class ThisKeyword1 {

	public static void main(String[] args) {
		Test t1 = new Test(23, 244.0f, "Nandhu");
		t1.display();
	}

}
