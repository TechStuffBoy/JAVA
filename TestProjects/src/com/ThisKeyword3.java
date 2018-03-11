package com;


class StudentThis {
	
	int rollNo;
	String name,course;
	float fees;
	
	public StudentThis(String name,int rollNo,String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	
	public StudentThis(String name,int rollNo,float fees,String course) {
		this(name,rollNo,course);
		this.fees = fees;
	}
	
	void display() {
		System.out.println("Name=" + name + " RollN0=" + rollNo 
				+ " Fees=" + fees + " course=" + course);
	}
}
public class ThisKeyword3 {

	public static void main(String[] args) {
		StudentThis nandhu = new StudentThis("Nandhu", 123, 233.0f, "Embedded Robotics");
		nandhu.display();
		StudentThis ram = new StudentThis("Ram", 122, "Embeddded Robotics");
		ram.display();
	}

}
