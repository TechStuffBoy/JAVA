package com;

//This keyword used to print the reference
public class ThisKeyword6 {
	void m(){
		System.out.println(this);
	}
	public static void main(String[] args) {
		ThisKeyword6 obj = new ThisKeyword6();
		System.out.println(obj);
		obj.m();
		
	}

}
