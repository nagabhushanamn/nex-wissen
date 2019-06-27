package com.app.wheel.v2;

public class CEATWheel implements Wheel {

	@Override
	public int rotate(int speed) {
		System.out.println("CEATWheel rotating ..");
		return speed * 3;
	}

}
