package com;

class Shape {
	
	void draw() {
		System.out.println("Drawing..");
	}
}

class Triangle extends  Shape {
	
	void draw() {
		System.out.println("Drawing triangle..");
	}
}

class Circle extends Shape {
	
	void draw() {
		System.out.println("Drawing circle..");
	}
}

class Rectangle extends Shape {
	
	void draw() {
		System.out.println("Drawing rectangle..");
	}
}

public class RuntimeShape {

	public static void main(String[] args) {
		
		Shape shape;
		
		shape = new Shape();
		shape.draw();
		
		shape = new Circle();
		shape.draw();
		
		shape = new Triangle();
		shape.draw();
		
		shape = new Rectangle();
		shape.draw();
		
		
	}

}
