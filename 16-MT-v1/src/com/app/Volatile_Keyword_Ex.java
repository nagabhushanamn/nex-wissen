package com.app;

/*
 * 
 *  for visibility , on shared variables 
 * 
 */

public class Volatile_Keyword_Ex {

	private volatile static int MY_INT = 0;

	static class ChangeListener extends Thread {
		@Override
		public void run() {
			int local_value = MY_INT; // cache
			while (local_value < 5) {
				if (local_value != MY_INT) {
					System.out.printf("Got Change for MY_INT : %d \n", MY_INT);
					local_value = MY_INT;
				}
			}
		}
	}

	static class ChangeMaker extends Thread {
		@Override
		public void run() {
			int local_value = MY_INT; // cache
			while (MY_INT < 5) {
				System.out.printf("Incrementing MY_INT to %d \n", local_value + 1);
				MY_INT = ++local_value;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		new ChangeListener().start();
		new ChangeMaker().start();

	}

}
