package com.Day1.constructors;

//practice of constructor overloading
public class EmployeeConsDemo {
	public static void main(String[] args) {
		System.out.println("Main method starts");

		Employeee employee = new Employeee();
		System.out.println(employee);
		employee.displayEmployeeDetails();

		Employeee employee3 = new Employeee(2001, "Siri", "Permanent", 6500.20, 100.00, 110, "Guest@123");
		System.out.println(employee3);
		employee3.displayEmployeeDetails();

		Employeee employee2 = new Employeee();
		System.out.println(employee2);
		employee2.displayEmployeeDetails();

		// immplementing copy constructor
		Employeee employee4 = new Employeee(employee2);
		System.out.println(employee4);
		employee4.displayEmployeeDetails();

		// checking if both objects have same memory location
		if (employee2 == employee4)
			System.out.println("Pointing to same memory location");
		else
			System.out.println("Pointing to Different memory location");
		System.out.println("Main method Ends");

		// we can create n number of object of the same class and each object will have
		// same state
		// becoz we are using default constructor and default constructor will have the
		// static values

		// In case of parameterized constructor we need to follow the order in which we
		// are keeping else we will get compile time error.

		System.out.println("Main method Ends");
	}
}