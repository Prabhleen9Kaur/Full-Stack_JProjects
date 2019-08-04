package com.marlabs.interfaceactivity;

public abstract class Employee implements IEmployee {
	int empNumber;
	String empName;
	String empJob;
	private String empPassWord;
	int empDeptNumber;

	/**
	 * @return the empPassWord
	 */
	@Override
	public String getEmpPassWord() {
		return empPassWord;
	}

	/**
	 * @param empPassWord
	 *            the empPassWord to set
	 */
	@Override
	public void setEmpPassWord(String empPassWord) {
		this.empPassWord = empPassWord;
	}

	/**
	 * @param empNumber
	 * @param empName
	 * @param empJob
	 * @param empPassWord
	 * @param empDeptNumber
	 */
	public Employee(int empNumber, String empName, String empJob,
			String empPassWord, int empDeptNumber) {
		System.out.println("From Employee Cons");
		this.empNumber = empNumber;
		this.empName = empName;
		this.empJob = empJob;
		this.empPassWord = empPassWord;
		this.empDeptNumber = empDeptNumber;
	}

	@Override
	public void displaySalaryStatement() {
		System.out.println("**********************************");
		System.out.println("Employee Number:" + "\t" + empNumber);
		System.out.println("Employee Name:" + "\t" + empName);
		System.out.println("Employee Job:" + "\t" + empJob);
		System.out.println("Employee Dept Number:" + "\t" + empDeptNumber);
	}

}
