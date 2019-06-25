package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class Map_Colln_Ex3 {

	public static void main(String[] args) throws IOException {

		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(123, "one two three");
		File file = new File("db.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fis);
		fis.close();

		String dbUrl = properties.getProperty("db.url");
		System.out.println(dbUrl);

	}

}
