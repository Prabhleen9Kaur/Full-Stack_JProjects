package com.marlabs.inheritance;

public class PEmployee extends Employee {
	double empBasic;
	double empCommission;

	/**
	 * @param empNumber
	 * @param empName
	 * @param empDesignation
	 * @param empPassWord
	 * @param empDeptNumber
	 * @param empBasic
	 * @param empCommission
	 */
	public PEmployee(int empNumber, String empName, String empDesignation,
			String empPassWord, int empDeptNumber, double empBasic,
			double empCommission) {
		// super at Constructor Level
		super(empNumber, empName, empDesignation, empPassWord, empDeptNumber);
		System.out.println("From PEmployee Parameterized Cons");
		this.empBasic = empBasic;
		this.empCommission = empCommission;
		System.out.println(this);
	}

	private double doSalaryCaliculation() {
		double takeHomeSalary = 0.0d; // Method Local Variable
		if (empDeptNumber == 10) {
			takeHomeSalary = Math.round(empBasic + empBasic * .04 + empBasic
					* .04 + empCommission);
		} else if (empDeptNumber == 20) {
			takeHomeSalary = Math.round(empBasic + empBasic * .03 + empBasic
					* .03 + empCommission);
		} else {
			takeHomeSalary = Math.round(empBasic + empCommission);
		}
		return takeHomeSalary;
	}

	@Override // override annotations means this is a overrided method
	// JDK 1.5 Version
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();// super at Method Level
		System.out.println("Employee Basic Salary:" + "\t" + empBasic);
		System.out.println("Employee Commission:" + "\t" + empCommission);
		// this at Method Level
		double takeHomeSalary = this.doSalaryCaliculation();
		System.out
				.println("Employee Take Home Salary:" + "\t" + takeHomeSalary);
		System.out
				.println("**************************************************");
	}
}
