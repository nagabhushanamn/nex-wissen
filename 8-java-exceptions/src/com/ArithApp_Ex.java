package com;

import java.util.Scanner;

public class ArithApp_Ex {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number-1");
		int n1 = scanner.nextInt();

		System.out.println("Enter Number-2");
		int n2 = scanner.nextInt();

		System.out.println("1-Add");

		System.out.println("2-Sub");

		try {
//		if (n2 != 0) {
			System.out.println("3-Div");
			System.out.println(n1 / n2);
//		} else {
//			System.out.println("can't divide these numbers");
//		}
		} catch (Exception e) {
			// TODO: handle exception
			/*
			 *  --> display friendly error messages
			 *  --> log the exception for future fix
			 *  --> re-throw the exception to other module
			 *  --> release used external resources ( db connections , sockets , file streams ... )
			 * 
			 */
			System.out.println("Ex-"+e.getMessage());
		}

		System.out.println("4-Mul");

		scanner.close();
		System.out.println("All is well");

	}

}
