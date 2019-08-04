package com.marlabs.typesofrelations;

public class SingleTonExampleDemo {
	public static void main(String[] args) {
		System.out.println("I AM From Main Method");
		MySingleTon object = MySingleTon.getInstance();
		System.out.println(object);

		MySingleTon object1 = MySingleTon.getInstance();
		System.out.println(object1);
		if (object == object1) {
			System.out.println("Both References Were Equal");
		}

		/*
		 * MySingleTon object2 = new MySingleTon(); System.out.println(object2);
		 */
		boolean loginFlag = object.validateUserDetails("C001", "CT@123");
		if (loginFlag) {
			System.out.println("login Success");
		}
		System.out.println("End Of Main Method");
	}
}
