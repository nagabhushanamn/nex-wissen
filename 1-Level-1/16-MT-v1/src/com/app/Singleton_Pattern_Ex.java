package com.app;

class Singleton {
	
	private static volatile Singleton singleton;

	private Singleton() {
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;

	}
}


enum NewSingleton {
	SINGLETON;
}

public class Singleton_Pattern_Ex {

	public static void main(String[] args) {

	}

}
