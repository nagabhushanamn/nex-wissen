package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Owner {

	private String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Car {

	private String model;
	private String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

}

public class Map_Colln_Ex2 {

	public static void main(String[] args) {

		Owner owner1 = new Owner("Nag"); // 75
		Owner owner2 = new Owner("Ria");

		Car car1 = new Car("fortuner", "white");
		Car car2 = new Car("benz-toy", "red");

		// --------------------------------------------
		Map<Owner, Car> map = new HashMap<>();
		map.put(owner1, car1);
		map.put(owner2, car2);
		// --------------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter owner name?");

		String name = scanner.nextLine();
		Owner owner = new Owner(name); // 35

		Car car = map.get(owner);
		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("You don't have car");
		}

		scanner.close();

	}

}
