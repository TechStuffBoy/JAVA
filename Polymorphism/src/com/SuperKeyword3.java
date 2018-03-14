package com;

class Animall{  
	Animall(){System.out.println("animal is created");}  
}  
class Dogg extends Animall{  
	Dogg(){  
		super();  
		System.out.println("dog is created");  
	}  
}  
class SuperKeyword3{  
	public static void main(String args[]){  
		Dogg d=new Dogg();  
	}}  
