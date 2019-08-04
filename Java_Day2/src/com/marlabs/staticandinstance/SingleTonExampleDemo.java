package com.marlabs.staticandinstance;

public class SingleTonExampleDemo {
	public static void main(String[] args) {
		System.out.println("I AM From Main Method");
		MySingleTon object = MySingleTon.getInstance();// return typr is mysingleton
		System.out.println(object);

		MySingleTon object1 = MySingleTon.getInstance();
		System.out.println(object1);
		if (object == object1) {// both objects are producing same instance
			System.out.println("Both References Were Equal");
		}

		
		// Even if we call the method two times , it is returning only one instance for us.
		/*
		 * MySingleTon object2 = new MySingleTon(); System.out.println(object2);
		 */

		System.out.println("End Of Main Method");
	}
}
