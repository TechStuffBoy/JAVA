package com;

//Runtime polymorphism can't be achieved by data members.
class Foo {
	int speedlimit = 90;
}

class Honda3 extends Foo {
	int speelimit = 150;
}

public class RuntimeDataMember {

	public static void main(String[] args) {
		Foo obj = new Honda3();
		System.out.println(obj.speedlimit); //90
	}

}
