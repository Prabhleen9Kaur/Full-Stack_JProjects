package com.marlabs.objectclassmethods;

import java.util.HashSet;
import java.util.Set;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		Customer customer = new Customer(101, "Abc Traders", "Guest@123",
				"Banglore");
		Class<? extends Customer> className = customer.getClass(); // Class
																	// Instance
		System.out.println(className);
		String classNameValue = className.getName();
		System.out.println("Name Of The Class:" + classNameValue);

		int hashCode = customer.hashCode();
		System.out.println("Hash Code Value:" + hashCode);

		Customer customer1 = new Customer(101, "Abc Traders", "Guest@123",
				"Banglore");
		boolean objectEqualsFlag = customer.equals(customer1);
		if (objectEqualsFlag) {
			System.out.println("Objects Were Equal");
		}

		// Generic's In Collections - Introduced In JDK 1.5 Version
		Set<Customer> customerSet = new HashSet<Customer>();
		customerSet.add(customer);
		customerSet.add(customer1);
		// The Enhanced For Loop - Introduced In JDK 1.5 Version
		// For Each Loop
		for (Customer cust : customerSet) {
			System.out.println(cust);
		}
		System.out.println("After For Each Loop");
		try {
			Object object = customer.clone();
			Customer clonedObject = (Customer) object; // Explicit Object
														// Casting
			System.out.println("Original Object Data:" + customer);
			System.out.println("Cloned Object Data:" + clonedObject);
			if (customer == clonedObject) {
				System.out.println("Both Are Pointing Same Reference");
			} else {
				System.out
						.println("Cloned Object And Original Object Are Having Different Memory");
			}

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		customer = null;
		customer1 = null; // Making Objects being Eligible For Garbage
							// Collection
		System.gc();
		/*
		 * Is it possible to force the Garbage Collector? - It is not possible
		 * to force the Garbage Collector, Only We Can Do Request
		 */
		System.out.println("End Of Main Method");
	}
}
