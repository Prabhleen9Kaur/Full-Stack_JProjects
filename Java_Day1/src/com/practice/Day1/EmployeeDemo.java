package com.practice.Day1;

public class EmployeeDemo {// Execution Logic class
	public static void main(String[] args) {
		System.out.println("Main method starts");
		// Employee is a variable of type class
		// new is dynamic memory allocation operator, responsible to create an object .
		// an object is created and the reference will be copied to the left hand side
		// variable
		Employee employee = new Employee();

		System.out.println(employee);

		employee.empNumber = 111;
		employee.empName = "AAA";
		employee.empType = "Contract";
		employee.empBasic = 9056.34d;
		employee.empComm = 2345;
		employee.empDeptNumber = 10;
		// employee.empPassword = "Guest@123";

		// calling displayEmployeeDetails method, it prints the state of an object
		// state of an object:
		employee.displayEmployeeDetails();

		Employee employee1 = new Employee();

		System.out.println(employee);

		employee1.empNumber = 222;
		employee1.empName = "BBB";
		employee1.empType = "Contract";
		employee1.empBasic = 10056.34d;
		employee1.empComm = 2000;
		employee1.empDeptNumber = 20;
		employee1.displayEmployeeDetails();

		Employee employee2 = new Employee();
		employee2.displayEmployeeDetails();
		employee2.doInitialisation();
		employee2.displayEmployeeDetails();
		employee2.setEmpPassword("Admin@123");
		System.out.println(employee2.getEmpPassword());

		// using parameterized methods
		Employee employee3 = new Employee();
		employee3.displayEmployeeDetails();
		employee3.doInitialisation(201, "Sri", "Permanent", 9800, 25d, 2500, "Guest@123 ");
		employee3.displayEmployeeDetails();

		System.out.println("Main method ends");

	}
}
