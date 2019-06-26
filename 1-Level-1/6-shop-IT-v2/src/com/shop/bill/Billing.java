package com.shop.bill;

import com.shop.pm.PriceMatrix;

public interface Billing {

	void setPriceMatrix(PriceMatrix priceMatrix);

	double getTotalPrice(String[] cart);

}