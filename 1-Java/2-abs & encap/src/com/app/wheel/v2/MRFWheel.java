package com.app.wheel.v2;

public class MRFWheel implements Wheel {

	public int rotate(int speed) {
		System.out.println("MRFWheel rotating..");
		return speed * 2;
	}
}
