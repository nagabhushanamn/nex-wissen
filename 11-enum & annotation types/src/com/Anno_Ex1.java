package com;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

class Super {
	public void abc() {
		System.out.println("Super :: abc()");
	}
}

class Sub extends Super {
	@Override
	public void abc() {
		System.out.println("Sub :: abc()");
	}
}

class Lib{
	@Deprecated
	public static void v1() {
		
	}
	public static void v2() {
		
	}
}

// JAXB tool ( JDK 1.6 )

/*
 * 
 *  <product id="23456">
 *  	<name>laptop</name>
 *  	<price>1000.00
 *  </product>
 * 
 */

@XmlRootElement(name="product")
class Product{
	@XmlAttribute(name="id")
	private String id;
	private String name;
	private double price;
}


/**
 * 
 * @author nag-training
 *
 */
public class Anno_Ex1 {

	public static void main(String[] args) {

		Super super1 = new Sub();
		super1.abc();

		@SuppressWarnings({ "rawtypes", "unused" })
		ArrayList arrayList = new ArrayList();

		
		Lib.v1();
		
	}

}
