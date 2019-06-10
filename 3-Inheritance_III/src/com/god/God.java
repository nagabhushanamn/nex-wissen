package com.god;

import com.live.Human;
//import com.live.Animal;
//import com.live.Human;
import com.live.LivingThing;

// Open for extension & closed for modification

public class God {
//
//	public void manageHuman(Human human) {
//		human.sleep();
//		human.eat();
//		human.study();
//		human.work();
//	}
//
//	public void manageAnimal(Animal animal) {
//		animal.sleep();
//		animal.eat();
//		animal.work();
//	}

	public void manageLT(LivingThing livingThing) {
		livingThing.sleep();
		livingThing.eat();
		if (livingThing instanceof Human) {
			Human human = (Human) livingThing;
			human.study();
		}
		livingThing.work();
	}

}
