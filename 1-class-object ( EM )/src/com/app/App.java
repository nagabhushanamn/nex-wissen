package com.app;

import com.app.hr.HR;

public class App {

	public static void main(String[] args) {

		System.out.println("start...");

//		HR hr = new HR();
//		hr.manageEmployees();

		HR.manageEmployees();

		System.out.println("end...");

	}

}
