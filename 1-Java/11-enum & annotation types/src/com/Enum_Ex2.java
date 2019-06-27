package com;

interface I {
	void m();
}

enum Direction implements I {

	NORTH(10) {
		public void move() {

		}

		@Override
		public void m() {

		}
	},
	SOUTH(20) {
		@Override
		public void move() {

		}

		@Override
		public void m() {

		}
	},
	EAST(30) {
		@Override
		public void move() {
		}

		@Override
		public void m() {

		}

	},
	WEST(40) {

		@Override
		public void move() {

		}

		@Override
		public void m() {

		}
	};

	int value;

	Direction(int value) {
		this.value = value;
	}

	public abstract void move();

//	@Override
//	public void m() {
//		
//	}
	public static void sta() {
		System.out.println("sta method");
	}

}

public class Enum_Ex2 {

	public static void main(String[] args) {

		Direction.NORTH.move();

		System.out.println(Direction.NORTH.value);

//		System.out.println(Direction.NORTH.ordinal());
//		System.out.println(Direction.SOUTH.ordinal());
//		System.out.println(Direction.EAST.ordinal());
//		System.out.println(Direction.WEST.ordinal());
//		

//		Direction[] directions=Direction.values();
//		for(Direction direction:directions) {
//			System.out.println(direction.name());
//		}

//		Direction direction = Direction.NORTH;
//
//		switch (direction) {
//		case NORTH:
//
//			break;
//		case SOUTH:
//
//			break;
//		case EAST:
//
//			break;
//		case WEST:
//
//			break;
//
//		default:
//			break;
//		}Ï

	}

}
