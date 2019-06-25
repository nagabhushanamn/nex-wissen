package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex8 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File("react.pdf");
		FileInputStream fis = new FileInputStream(file);
		byte[] fileData = new byte[(int) file.length()];
		fis.read(fileData);
		fis.close();

		FileOutputStream fos = new FileOutputStream("new-react.pdf");
		fos.write(fileData);
		fos.close();
		
		System.out.println("file copy done");

	}

}
