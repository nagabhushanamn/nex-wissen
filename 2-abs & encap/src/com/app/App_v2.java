package com.app;

import com.app.car.v2.Car;
import com.app.wheel.v2.CEATWheel;
import com.app.wheel.v2.MRFWheel;
import com.app.wheel.v2.Wheel;

public class App_v2 {

	public static void main(String[] args) {

		Car car = new Car();
		Wheel mrfWheel = new MRFWheel();
		car.setWheel(mrfWheel);

		car.move();
		System.out.println();
		car.move();

		Wheel ceatWheel = new CEATWheel();
		car.setWheel(ceatWheel);

		System.out.println();
		car.move();
		System.out.println();
		car.move();

	}

}
