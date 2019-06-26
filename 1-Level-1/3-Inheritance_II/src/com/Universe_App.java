package com;

import com.god.God;
import com.live.Animal;
import com.live.Human;
import com.live.Robot;

public class Universe_App {

	public static void main(String[] args) {

		God god = new God();

		Human human = new Human();
		Animal animal = new Animal();
		Robot robot = new Robot();

		System.out.println("----------------");
		System.out.println("Human");
		System.out.println("----------------");
//		god.manageHuman(human);
		god.manageLT(human);

		System.out.println("----------------");
		System.out.println("Animal");
		System.out.println("----------------");
//		god.manageAnimal(animal);
		god.manageLT(animal);

		System.out.println("----------------");
		System.out.println("Robot");
		System.out.println("----------------");
		god.manageLT(robot);

		System.out.println();

		System.out.println("All is well in universe");

	}

}
