package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrix_v1;
import com.shop.pm.PriceMatrix_v2;

public class App {

	public static void main(String[] args) {

		// --------------------------------------
		// Init / boot
		// --------------------------------------

		PriceMatrix priceMatrixV1 = new PriceMatrix_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrix_v2();

		Billing billing = new BillingImpl();
		billing.setPriceMatrix(priceMatrixV2);

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
