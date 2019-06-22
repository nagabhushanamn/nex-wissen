package com;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex7 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("menu.txt");
//		PrintWriter pw = new PrintWriter(fw);
		fw.write("item-1");
		fw.write("item-2");
		fw.write("item-3");
		fw.flush();
		fw.write("item-4");
		fw.close();
		fw.write("item-5");
		

	}

}
