package com.app;

interface Shape {
	void clear();

	void draw();
}

interface Polygon extends Shape {
}

interface Circle extends Shape {
}

class SmallCircle implements Circle {
	public void clear() {
		// ..
	}

	public void draw() {
		//
	}
}

//-------------------------------------

interface I1 {
}

interface I2 {
}

interface I3 extends I1, I2 {
}

class C implements I1, I2 {
}

//-------------------------------------

interface A {
	void m();
}

interface B {
	void m();
}

class C2 implements A, B {
	public void m() {
		// ..
	}
}

//-------------------------------------

public class Interface_Ex2 {

	public static void main(String[] args) {

		Shape shape = new SmallCircle();
		shape.draw();
		shape.clear();

	}

}
