package com;

// Before JDK 1.5

class Java {
}

class Js {
}

class Trainer {

	private Object subject;

	public Object getSubject() {
		return subject;
	}

	public void setSubject(Object subject) {
		this.subject = subject;
	}

}

public class Why_Generic_Types_Ex1 {

	public static void main(String[] args) {

		// --------------------------------------
		Trainer javaTrainer = new Trainer();
		javaTrainer.setSubject(new Java());
		// --------------------------------------

		// --------------------------------------

		javaTrainer.setSubject(new Js()); // No type-safety on subject

		// --------------------------------------

		// class-room module
		// ----------------------------------
		Object object = javaTrainer.getSubject();
		Java java = (Java) object;
		System.out.println("All is well in class room");
		// ----------------------------------

	}

}
