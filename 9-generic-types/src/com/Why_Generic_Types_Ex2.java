package com;

// From JDK 1.5

class NewJava {
}

class NewJs {
}

class NewTrainer<T> {

	private T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

public class Why_Generic_Types_Ex2 {

	public static void main(String[] args) {

		// --------------------------------------
		NewTrainer<NewJava> javaTrainer = new NewTrainer<NewJava>();
		javaTrainer.setSubject(new NewJava());
		// --------------------------------------

		// --------------------------------------

//		javaTrainer.setSubject(new NewJs()); // No type-safety on subject

		// --------------------------------------

		// class-room module
		// ----------------------------------
		NewJava newJava = javaTrainer.getSubject();
		System.out.println("All is well in class room");
		// ----------------------------------

	}

}
