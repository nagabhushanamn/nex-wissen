package com.app.car.v1;

import com.app.wheel.v1.MRFWheel;

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

public class Car {

	public void move() {

		MRFWheel mrfWheel = new MRFWheel();
		mrfWheel.rotate();

		System.out.println("Car moving..");

	}

}
