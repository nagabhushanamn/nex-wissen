package com;

class Abc {

}

public class Ex {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Abc abc=new Abc();

		System.out.println(abc.getClass()==Abc.class);
		
		Class<?> clazz=Class.forName("com.Abc");
		
		System.out.println(clazz==Abc.class);
		
	}

}
