package com;

class Resource {

	public void init() {
		System.out.println("Resource :: init()");
	}

	public void use() throws IllegalAccessException {
		System.out.println("Resource :: use()");
		boolean canAccess = true;
		if (!canAccess)
			throw new IllegalAccessException("illegal access");
	}

	public void close() {
		System.out.println("Resource :: close()");
	}

}

public class Try_Finally_Syntax_Ex {

	public static void main(String[] args) {

		Resource resource = new Resource();
		try {
			resource.init();
			resource.use();
			return;
//			System.exit(0);
			// resource.close();
		} catch (IllegalAccessException e) {
			// resource.close();
			System.out.println("Ex-" + e.getMessage());
		} finally {
			resource.close();
		}
//		resource.close();

		try {

		} catch (Exception e) {
			// TODO: handle exception
			try {

			} catch (Exception ee) {
				// TODO: handle exception
			}
		} finally {
			///
		}

		try {

		} finally {

			try {

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
