package com.good;

/*
 * 
 * design issues
 * ----------------
 * 
 *   ==> code scattering / duplication
 *   ==> code tangling / tightly coupled
 *   
 *    soln:
 *    
 *    	==> proxy design pattern
 * 
 */

interface Service {
	public void learningService();

	public void otherService();
}

class Nexwave implements Service {
	public void learningService() {
		System.out.println("learn()");
	}

	public void otherService() {
		System.out.println("other()");
	}
}

class Auth {
	public void doAuth() {
		System.out.println("Auth..");
	}
}

class Logger {
	public void beforeLog() {
		System.out.println("LOG :: in");
	}

	public void afterLog() {
		System.out.println("LOG :: out");
	}
}

//// way-1 : proxy by inheritance

//class NexwaveProxy extends Nexwave {
//	
//	Auth auth = new Auth();
//
//	public void learningService() {
//		auth.doAuth();
//		super.learningService();
//	}
//
//	public void otherService() {
//		auth.doAuth();
//		super.otherService();
//	}
//}

//way-2 : proxy by composition
class NexwaveProxy implements Service {

	Auth auth = new Auth();
	Logger logger = new Logger();
	Nexwave nexwave = new Nexwave();

	@Override
	public void learningService() {
		auth.doAuth();
		logger.beforeLog();
		nexwave.learningService();
		logger.afterLog();
	}

	@Override
	public void otherService() {
		auth.doAuth();
		logger.beforeLog();
		nexwave.otherService();
		logger.afterLog();
	}

}

public class Ex1 {

	public static void main(String[] args) {

		NexwaveProxy nexwaveProxy = new NexwaveProxy();
		nexwaveProxy.learningService();
		

	}

}
