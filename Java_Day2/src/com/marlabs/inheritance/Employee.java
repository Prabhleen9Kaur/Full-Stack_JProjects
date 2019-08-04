package com.marlabs.inheritance;

public class Employee {
	int empNumber;
	String empName;
	String empDesignation;
	private String empPassWord;
	int empDeptNumber;

	/**
	 * @return the empPassWord
	 */
	public String getEmpPassWord() {
		return empPassWord;
	}

	/**
	 * @param empPassWord
	 *            the empPassWord to set
	 */
	public void setEmpPassWord(String empPassWord) {
		this.empPassWord = empPassWord;
	}

	/**
	 * @param empNumber
	 * @param empName
	 * @param empDesignation
	 * @param empPassWord
	 * @param empDeptNumber
	 */
	public Employee(int empNumber, String empName, String empDesignation,
			String empPassWord, int empDeptNumber) {
		System.out.println("From Employee Base Class Cons");
		this.empNumber = empNumber;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empPassWord = empPassWord;
		this.empDeptNumber = empDeptNumber;
		System.out.println(this);
	}

	public void displayEmployeeDetails() {
		System.out.println("**********************************************");
		System.out.println("Employee Number:" + "\t" + empNumber);
		System.out.println("Employee Name:" + "\t" + empName);
		System.out.println("Employee Designation:" + "\t" + empDesignation);
		System.out.println("Employee Department Number:" + "\t" + empDeptNumber);
	}
}
