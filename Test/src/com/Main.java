package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student nandhu = new Student();
		Student ram = new Student();
		nandhu.insertRecord(1, "Nandhu");
		ram.insertRecord(2, "Ram");
		nandhu.displayInfo();
		ram.displayInfo();
	}


}
