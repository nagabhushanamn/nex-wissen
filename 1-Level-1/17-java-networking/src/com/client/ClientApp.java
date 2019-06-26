package com.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientApp {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("localhost", 8181);
			// ...

			InputStream in = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(in);
			Object object = ois.readObject();
			String resp = (String) object;

			System.out.println("resp : " + resp);

			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
