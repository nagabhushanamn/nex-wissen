package com.server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

// java.net.*

public class ServerApp {

	private static int reqCount = 0;

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(8181);
			while (true) {
				System.out.println("waiting for client request..");
				Socket socket = serverSocket.accept(); // accepts request
				System.out.println("accepted client request..");

				TimeUnit.SECONDS.sleep(5);
				reqCount++;

				OutputStream out = socket.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(out);
				oos.writeObject("hello client, your req count is " + reqCount);
				oos.close();
				System.out.println("respose sent back");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
