package com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

//--------------------------------------------
// vendor/third-party's code 
//--------------------------------------------

/*
class Container {
	
	private UserController userController = new UserController();

	public void processRequest(String url) {
		// complete infra logic about how to handle http-request
		if(url.equals("/users/login")) {
			userController.doLogin();
		}
		if(url.equals("/users/register")) {
			userController.doRegister();
		}
	}
}
*/

//--------------------------------------------

@Target(value = { ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@interface RequestMapping {
	String url();
}

// server | frramework ( e.g spring )
class Container {
	public void processRequest(String url) {
		// complete infra logic about how to handle http-request
		try {

			Class<?> clazz1 = Class.forName("com.UserController");
			Object instance1 = clazz1.newInstance();
			// <bean id="instance1" class="com.UserController"/>
			
			Class<?> clazz2 = Class.forName("com.TxrController");
			Object instance2 = clazz2.newInstance();
			
			Method[] methods=clazz1.getMethods();
			for(Method method:methods) {
				RequestMapping rm=method.getAnnotation(RequestMapping.class);
				if(rm!=null) {
					String givenUrl=rm.url();
					if(url.equals(givenUrl)) {
						method.invoke(instance1, new Object[] {});
					}
				}
			}
			Method[] methods2=clazz2.getMethods();
			for(Method method:methods2) {
				RequestMapping rm=method.getAnnotation(RequestMapping.class);
				if(rm!=null) {
					String givenUrl=rm.url();
					if(url.equals(givenUrl)) {
						method.invoke(instance2, new Object[] {});
					}
				}
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}

//--------------------------------------------
//developer's code 
//--------------------------------------------
class UserController {
	// url: /users/register
	@RequestMapping(url = "/users/register")
	public void doRegister() {
		System.out.println("UserController :: doRegister()");
	}

	// url: /users/login | signin
	@RequestMapping(url = "/users/login")
	public void doLogin() {
		System.out.println("UserController :: doLogin()");
	}
}



//--------------------------------------------
//developer's code 
//--------------------------------------------
class TxrController {
	// url: /users/register
	@RequestMapping(url = "/users/txr")
	public void doTxr() {
		System.out.println("TxrController :: doTxr()");
	}
	
}
public class Anno_Ex2 {

	public static void main(String[] args) throws Exception {

		Container container = new Container();

		TimeUnit.SECONDS.sleep(2);
		container.processRequest("/users/register");

		TimeUnit.SECONDS.sleep(2);
		container.processRequest("/users/login");
		
		TimeUnit.SECONDS.sleep(2);
		container.processRequest("/users/txr");

	}

}
