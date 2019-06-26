package com;

public class Ex1 {

	public static void main(String[] args) {

		Runnable task = () -> {
			System.out.println("hello world");
		};

		// before JDK 1.5
		Thread thread = new Thread(task);
		thread.start();

		/*
		 * --> thread-management must isolated from appln's logic
		 * --> threads are created on-demand,by the user
		 * --> Once the task is done,the thread dies
		 * 
		 * soln:
		 * 
		 * 		==> using 'thread-pools'
		 * 
		 * 
		 * 			in JDK 1.5 ==> 'thread-pool' framework ==> Executor F.W
		 * 
		 */

	}

}
