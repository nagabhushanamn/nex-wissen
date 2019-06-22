package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//
//		System.out.println("Enter input..");
//		int uc = inputStreamReader.read();
//		System.out.println((char) uc);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter input..");

		String input = bufferedReader.readLine();
		System.out.println(input);

	}

}
