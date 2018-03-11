package com;

public class Student {
	int id;
	String name;
	
	void insertRecord(int iId, String iName) {
		id = iId;
		name = iName;
	}
	
	void displayInfo() {
		System.out.println(id + " " + name);
	}
}
