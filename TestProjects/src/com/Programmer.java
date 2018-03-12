package com;


class Employee {
	float salary;
	String name;
	String location;
}

public class Programmer extends Employee {
	float bonus;
	String maritalStatus;
	
	Programmer(String name,String location,float salary, float bonus,String maritalStatus) {
		this.name = name;
		this.location = location;
		this.maritalStatus = maritalStatus;
		this.salary = salary;
		this.bonus = bonus;
	}
	void displyEmployyeInfo() {
		System.out.println("Name=" + this.name + " Location=" + this.location +
				" MaritalStatus=" + this.maritalStatus + " Salary=" + this.salary 
				+ " Bonus=" + this.bonus);
	}
	public static void main(String[] args) {
		
		Programmer nandhu = new Programmer("Nandhu","India", 10000.0f, 1000.0f, "Single");
		nandhu.displyEmployyeInfo();
	}

}
