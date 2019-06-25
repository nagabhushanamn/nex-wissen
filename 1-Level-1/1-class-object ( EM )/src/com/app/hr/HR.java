package com.app.hr;

import com.app.emp.Employee;

public class HR {

	public static void manageEmployees() {

		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "A";

		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "B";

		Employee.teach();

		e1.listenAndWork();
		e2.listenAndWork();

	}

}
