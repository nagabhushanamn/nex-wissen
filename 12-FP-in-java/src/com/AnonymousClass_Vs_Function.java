package com;

import java.util.function.Consumer;

public class AnonymousClass_Vs_Function {

	public static void main(String[] args) {

		String user = "Nag";

		// -----------------------------------------------------
//		class FoodConsumer implements Consumer<String> {
//			@Override
//			public void accept(String food) {
//				System.out.println(user + " => yummy with " + food);
//			}
//		}
//
//		Consumer<String> consumer = new FoodConsumer();
//		consumer.accept("biryani");

		// -----------------------------------------------------
//
//		Consumer<String> consumer = new Consumer<String>() {
//			@Override
//			public void accept(String food) {
//				System.out.println(user + " => yummy with " + food);
//			}
//		};
//		consumer.accept("biryani");
//		
		// -----------------------------------------------------
//		
//		Consumer<String> consumer=food->System.out.println(user + " => yummy with " + food);
//		consumer.accept("biryani");	
//		
		
		// -----------------------------------------------------
		

	}

}
