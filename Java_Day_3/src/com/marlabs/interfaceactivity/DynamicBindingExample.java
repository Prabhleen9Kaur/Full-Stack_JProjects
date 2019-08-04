package com.marlabs.interfaceactivity;

import java.util.Scanner;

public class DynamicBindingExample {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		Employee employee = null;// Base Class Reference
		System.out.println("Enter The Type Of Employee");
		Scanner scanner = new Scanner(System.in);
		String empType = scanner.next();
		if ("PEmployee".equals(empType)) {
			employee = new PEmployee(2000, "AAA", "Tester", "Test@123", 10,
					9000, 2530.25d);
		} else if ("CEmployee".equals(empType)) {
			employee = new CEmployee(3000, "BBB", "Devloper", "Test@123", 20,
					780.50f, 24.50f);
		} else {
			System.err.println("Enter Correct Type Of Employee");
			System.exit(0); // Successful Termination OF JVM
		}
		employee.doSalaryCaliculation(); // Polymorphic Method
		employee.displaySalaryStatement();
		employee.setEmpPassWord("Admin@123");
		scanner.close();
		System.out.println("End Of Main Method");
	}
}
/*
 * Method Call Will Be Resolved By The JVM At Runtime Only, This is called
 * runtime polymorphisam
 */
