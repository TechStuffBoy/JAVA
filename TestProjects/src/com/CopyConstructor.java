package com;

class Student5 {
	int id;
	String name;
	
	public Student5(int iId, String iName) {
		id = iId;
		name =iName;
	}
	
	public Student5(Student5 copy) {
		id = copy.id;
		name = copy.name;
	}
	
	void display() {
		System.out.println("Id= " + id + " Name=" + name);
	}
	
}
public class CopyConstructor {

	public static void main(String[] args) {
		Student5 nandhu = new Student5(1, "Nandhu");
		Student5  nandhuCopy = new Student5(nandhu);
		
		nandhu.display();
		nandhuCopy.display();
	}

}
