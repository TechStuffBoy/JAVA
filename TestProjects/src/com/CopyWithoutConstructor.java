package com;


class Name {
	String name;
	String fatherName;
	
	Name(String iName, String iFatherName) {
		name = iName;
		fatherName = iFatherName;
	}
	
	void display() {
		System.out.println("Name= " + name + " , FatherName= " + fatherName);
	}
}

public class CopyWithoutConstructor {
	
	public static void main(String[] args) {
		Name nandhu = new Name("Nandhu", "Murali");
		Name nandhuCopy = null;
		nandhuCopy = nandhu;
		nandhu.display();
		nandhuCopy.display();
	}

}
