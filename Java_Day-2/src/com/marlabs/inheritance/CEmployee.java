package com.marlabs.inheritance;

public class CEmployee extends Employee {
	double perDaySalary;
	float numberOfDays;

	/**
	 * @param empNumber
	 * @param empName
	 * @param empDesignation
	 * @param empPassWord
	 * @param empDeptNumber
	 * @param perDaySalary
	 * @param numberOfDays
	 */
	public CEmployee(int empNumber, String empName, String empDesignation,
			String empPassWord, int empDeptNumber, double perDaySalary,
			float numberOfDays) {
		super(empNumber, empName, empDesignation, empPassWord, empDeptNumber);
		System.out.println("From CEmployee Parameterized Cons");
		this.perDaySalary = perDaySalary;
		this.numberOfDays = numberOfDays;
	}

	private double doSalaryCaliculation() {
		double takeHomeSalary = 0.0d; // Method Local Variable
		takeHomeSalary = Math.round(perDaySalary * numberOfDays);
		return takeHomeSalary;
	}

	@Override
	// JDK 1.5 Version
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();// super at Method Level
		System.out.println("Employee Per-Day Salary:" + "\t" + perDaySalary);
		System.out.println("Employee Worked-Days:" + "\t" + numberOfDays);
		// this at Method Level
		double takeHomeSalary = this.doSalaryCaliculation();
		System.out
				.println("Employee Take Home Salary:" + "\t" + takeHomeSalary);
		System.out
				.println("**************************************************");
	}
}
