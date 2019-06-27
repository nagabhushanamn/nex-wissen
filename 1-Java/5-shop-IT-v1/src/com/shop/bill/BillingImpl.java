package com.shop.bill;

import com.shop.pm.PriceMatrix_v1;

/*
 * 
 *  design & performance issues
 *  -----------------------------
 *  
 *  --> tight-coupling b/w dependent & dependency
 *  	==> can't extend module with new features
 *  --> too many duplicate dependency instances created & destroyed
 *  	==> slow,memory/resource use high
 *  --> unit-testing not possible
 *  	==> dev/bug fix slow
 *  
 *  
 *  why these issues ?
 *  
 *  	==> dependent itself creating it's own dependency
 *  
 *  soln:
 *  
 *  	==> don't create , lookup from factory
 *  
 *   limitation factory-lookup:
 *   
 *      ==> factory location tight-coupling 	
 *  
 *  best-soln:
 *  
 *  	==> don't create/lookup , get / inject by 'third-party' ( IOC )
 *  
 *  		IOC ==> Inversion of Control
 *  
 *  	how to implement IOC ?
 *  
 *  	way-1 : dependency injection ( DI )
 *  	way-2 : AOP 
 *  
 *  
 *  	--------------------------------------------------------
 *  	OO principles
 *  	--------------------------------------------------------
 *  
 	
	 	S.O.L.I.D. STANDS FOR:
		
		S — Single responsibility principle
		O — Open for extension & closed for modification principle
		L — Liskov substitution principle
		I — Interface segregation principle
		D — Dependency Inversion principle
		
 *  
 *  
 *  	--------------------------------------------------------
 * 
 */

public class BillingImpl {

	private PriceMatrix_v1 priceMatrix;

	public double getTotalPrice(String[] cart) {
		double total = 0.0;
		priceMatrix = new PriceMatrix_v1();
		for (String itemCode : cart) {
			total += priceMatrix.getPrice(itemCode);
		}
		return total;

	}

}
