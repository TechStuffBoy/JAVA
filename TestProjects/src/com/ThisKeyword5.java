package com;

class Boat {
	ThisKeyword5 obj;
	Boat(ThisKeyword5 obj) {
		this.obj = obj;
	}
	void display(){
		System.out.println(obj.data); //using datamember of ThisKeyword5 class
	}
}

public class ThisKeyword5 {

	int data = 10;
	public ThisKeyword5() {
		// TODO Auto-generated constructor stub
		Boat b = new Boat(this);
		b.display();
	}
	public static void main(String[] args) {
		ThisKeyword5  a = new ThisKeyword5();
	}

}
