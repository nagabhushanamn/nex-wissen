package com.live;

public abstract class LivingThing {

	public LivingThing() {
		// TODO Auto-generated constructor stub
	}

	public final void sleep() {
		System.out.println("LT :: sleep()");
	}

	public void eat() {
		System.out.println("LT :: eat()");
	}

	public abstract void work();

}
