package com;

/*
 * 
 * java.lang.Object
 * 
 */

class Product extends Object implements Cloneable {

	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
//		System.out.println("Product :: constructor()");
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product product = (Product) obj;
			return this.price == product.price;
		} else
			return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// wait(), notify, notifyAll

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.id + " finalized ");
	}

}

public class Ex1 {

	public static void main(String[] args) throws CloneNotSupportedException {

//		Product product1 = new Product(2312312, "item-1", 1000.00);
//		Product product2 = new Product(2312312, "item-1", 1000.00);

		// -------------------------------------------------

//		String s = product1.toString();
//		System.out.println(s);
//		
//		// or
//		
//		System.out.println(product1);

		// -------------------------------------------------

//		System.out.println(product1 == product2);
//		System.out.println(product1.equals(product2));

		// -------------------------------------------------

//		System.out.println(product1.getClass().getName());

		// -------------------------------------------------

//		System.out.println(product1.hashCode());
//		System.out.println(product2.hashCode());

		// -------------------------------------------------

//		Product product = (Product) product1.clone();
//		product.setPrice(2000.00);
//		System.out.println(product);
//		System.out.println(product1);

		// ---------------------------------------------------

		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());

		for (int i = 0; i < 1000000; i++) {
			Product product = new Product(i, "item" + i, 10 * i);
		}

		System.out.println(runtime.freeMemory());

		System.gc();

		System.out.println(runtime.freeMemory());

	}

}
