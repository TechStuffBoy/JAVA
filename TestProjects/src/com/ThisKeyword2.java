package com;



class Test1 {
	int id;
	float fees;
	String name;
	Test1(int id, float fees, String name) {
		this.id = id;
		this.fees = fees;
		this.name = name;
		System.out.println("Name=" + name + " id=" + id + " fees=" + fees);
	}
	void display() {
		System.out.println("In Display-> Name=" + name + " id=" + id + " fees=" + fees);
		//due to this keyword formal arguments are assigned properly wth instance variables
	}
}

public class ThisKeyword2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1(23, 244.0f, "Nandhu");
		t1.display();
	}

}
