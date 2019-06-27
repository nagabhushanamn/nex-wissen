package com;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {

		System.out.println("-----------------------------------");
		FileInputStream fis = new FileInputStream("arabic.txt"); // byte-stream
		int uc = -1;
		while ((uc = fis.read()) != -1) {
			System.out.println(uc);
		}
		fis.close();

		System.out.println("-----------------------------------");

		FileReader fr = new FileReader("arabic.txt"); // character-stream
		uc = -1;
		while ((uc = fr.read()) != -1) {
			System.out.println(uc);
		}
		fr.close();

		System.out.println("-----------------------------------");
	}

}
