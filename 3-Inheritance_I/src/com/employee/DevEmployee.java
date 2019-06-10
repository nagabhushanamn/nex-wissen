package com.employee;

public class DevEmployee extends Employee {

	public String devSkills;

	public DevEmployee(int id) {
//		if (id > 0)
//			this.id = id;
//		else
//			throw new IllegalArgumentException("invalid employee id");
		super(id);
	}

	@Override
	public String toString() {
		return "DevEmployee [devSkills=" + devSkills + ", id=" + getId() + ", name=" + name + ", salary=" + salary + "]";
	}

}
