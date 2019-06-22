package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.model.Company;
import com.model.Product;

interface I extends Serializable {

}

class A implements I {

}

class B implements I {

}

class Super implements Serializable {
}

class Sub1 extends Super {
}

/**
 * 
 * @author nag-training
 *
 *
 *         serialization
 *
 */

public class Ex5 {

	public static void main(String[] args) throws IOException {

		Company company = new Company("Abd Pvt Ltd");

		Product product1 = new Product(23123, "ITEM-1", 1000.00);
		Product product2 = new Product(32123, "ITEM-2", 2000.00);
//
//		product1.setCompany(company);
//		product2.setCompany(company);

		File file = new File("product.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(product1);
		oos.writeObject(product2);
		oos.flush();

		oos.close();

		System.out.println("java-object serialized");

	}

}
