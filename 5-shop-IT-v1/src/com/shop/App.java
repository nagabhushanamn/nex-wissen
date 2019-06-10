package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// --------------------------------------
		// Init / boot
		// --------------------------------------

		BillingImpl billing = new BillingImpl();

		// --------------------------------------
		// use
		// --------------------------------------

		String[] cart = { "23234", "234567", "3456780" };
		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);

		// --------------------------------------
		// Destroy
		// --------------------------------------
		// ...
	}

}
