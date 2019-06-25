package com;

import com.employee.DevEmployee;
import com.employee.OpsEmployee;

public class App {

	public static void main(String[] args) {

		DevEmployee devEmployee = new DevEmployee(111);
		OpsEmployee opsEmployee = new OpsEmployee(222);
		
		// devEmployee.id = 0; // Illegal write prevented with access specifers

	}

}
