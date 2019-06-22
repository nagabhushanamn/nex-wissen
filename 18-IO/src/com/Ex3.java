package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) throws IOException {

		File file = new File("Notes.txt");

//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
//		String line = null;
//		while ((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		fis.close();

//		// way-1 : without buffer
//		FileReader fr = new FileReader(file);
//		int uc = -1;
//		while ((uc = fr.read()) != -1) {
//			System.out.print((char) uc);
//		}
//		fr.close();

		// way-2 : with buffer
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		String line = null;
//		while ((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		fr.close();
		
		

	}

}
