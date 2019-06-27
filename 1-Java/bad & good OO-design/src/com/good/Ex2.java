package com.good;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/*
 * 
 *  observer/lister/event-driven pattern
 * 
 */

class DoorEvent {

	private int floorNm;
	private int doorNum;

	public DoorEvent(int floorNm, int doorNum) {
		super();
		this.floorNm = floorNm;
		this.doorNum = doorNum;
	}

	public int getFloorNm() {
		return floorNm;
	}

	public int getDoorNum() {
		return doorNum;
	}

}

interface DoorListener {
	void on(DoorEvent event);

	void off(DoorEvent event);
}

class Door {
	private ArrayList<DoorListener> listeners = new ArrayList<>();

	public void addDoorListenet(DoorListener listener) {
		listeners.add(listener);
	}

	public void removeDoorListener(DoorListener listener) {
		listeners.remove(listener);
	}

	public void open() {
		System.out.println("door opened");
		DoorEvent event = new DoorEvent(4, 5);
		for (DoorListener listener : listeners)
			listener.on(event);
	}

	public void close() {
		System.out.println("door closed");
		DoorEvent event = new DoorEvent(4, 5);
		for (DoorListener listener : listeners)
			listener.off(event);
	}
}

class Light implements DoorListener {

	@Override
	public void on(DoorEvent event) {
		System.out.println("Light >> ON " + event.getFloorNm() + "\t" + event.getDoorNum());
	}

	@Override
	public void off(DoorEvent event) {
		System.out.println("Light << OFF " + event.getFloorNm() + "\t" + event.getDoorNum());
	}

}

public class Ex2 {

	public static void main(String[] args) throws Exception {

		Door door = new Door();

		Light light = new Light();

		door.addDoorListenet(light);

		door.open();
		TimeUnit.SECONDS.sleep(2);
		door.close();

		door.removeDoorListener(light);

		door.open();
		TimeUnit.SECONDS.sleep(2);
		door.close();

	}

}
