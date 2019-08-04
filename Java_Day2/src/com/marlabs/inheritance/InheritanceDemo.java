 package com.marlabs.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		PEmployee pEmployee = new PEmployee(2001, "Srinivas", "Senior Trainer",
				"Guest@123", 10, 9256.02, 2530.23d);
		System.out.println(pEmployee);
		pEmployee.displayEmployeeDetails();
		pEmployee.setEmpPassWord("Admin@123");
		System.out.println(pEmployee.getEmpPassWord());

		CEmployee cEmployee = new CEmployee(3001, "Vasu", "PMP Trainer",
				"Guest@123", 20, 1500.56, 24.50f);
		System.out.println(cEmployee);
		cEmployee.displayEmployeeDetails();

		System.out.println("End Of Main Method");
	}
}
