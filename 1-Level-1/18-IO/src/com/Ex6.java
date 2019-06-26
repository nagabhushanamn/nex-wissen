package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.model.Product;

/**
 * 
 * @author nag-training
 *
 *
 *         dserialization
 *
 */

public class Ex6 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("product.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object object1 = ois.readObject();
		Product product1 = (Product) object1;
		Object object2 = ois.readObject();
		Product product2 = (Product) object2;

		System.out.println(product1);
		System.out.println(product2);

		ois.close();

	}

}
