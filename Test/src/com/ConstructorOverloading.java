package com;

class Student4 {
	int rollNo;
	String name;
	int age;
	
	public Student4(String iName,int irollNo) {
		rollNo = irollNo;
		name = iName;
		age = 24;
		System.out.println("Student with Name " + iName + " with rollNo " + irollNo
				+  " with default Age " + age + " is instanciated");
	}
	
	public Student4(String iName,int iRollNo,int iAge) {
		name = iName;
		rollNo = iRollNo;
		age = iAge;
		System.out.println("Student with Name " + iName + " with rollNo "
				+ iRollNo + " with Age " + iAge + " is instanciated");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Student4 namdhu = new Student4("Nandhu", 120);
		Student4 Ram = new Student4("Ram",121,23);
		
		//Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects  
		Student4 priti = new Student4("Priti", 122), 
				moni = new Student4("Monisha", 123, 24);
	}

}
