package com.live;

public class Robot extends LivingThing {

	@Override
	public void eat() {
		super.eat();
		System.out.println("Rob :: eat()");
	}

	@Override
	public void work() {
		System.out.println("Rob :: waork()");
	}

}
