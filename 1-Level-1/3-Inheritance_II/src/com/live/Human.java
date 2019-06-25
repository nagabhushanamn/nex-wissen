package com.live;

// Human IS-A LivingThing
public class Human extends LivingThing {

	public void study() {
		System.out.println("Hu :: study()");
	}

	@Override
	public void work() {
		System.out.println("Hu :: work()");
	}

}
