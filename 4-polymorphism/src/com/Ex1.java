package com;

class Actor {

	public void act(double pay) {
		System.out.println("hero acting..");
	}

	public void act() {
		System.out.println("side acting..");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Actor actor = new Actor();
		actor.act(1000.00);
		actor.act();

		System.out.println("string");
		System.out.println(12);
		System.out.println('A');

	}

}
