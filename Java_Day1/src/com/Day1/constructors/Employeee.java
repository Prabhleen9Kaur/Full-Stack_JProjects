package com.Day1.constructors;

public class Employeee {

	int empNumber;
	String empName;
	String empType;
	double empBasic;
	double empComm;
	int empDeptNumber;
	private String empPassword; // scope of this variable is with this class only

	/**
	 * 
	 * @return the empPassword
	 */
	public String getEmpPassword() {
		// To get the value of the employee password
		return empPassword;
	}

	/**
	 * 
	 * @param the empPassword set the empPassword
	 */
	public void setEmpPassword(String empPassword) {
		// To set the value of the employee password
		this.empPassword = empPassword;
	}

	/**
	 * @param empNumber
	 * @param empName
	 * @param empType
	 * @param empBasic
	 * @param empComm
	 * @param empDeptNumber
	 * @param empPassword
	 */
	public Employeee(int empNumber, String empName, String empType, double empBasic, double empComm, int empDeptNumber,
			String empPassword) {
		System.out.println("Parameterized Constructor");
		this.empNumber = empNumber; // this keyword used at variable level
		this.empName = empName;
		this.empType = empType;
		this.empBasic = empBasic;
		this.empComm = empComm;
		this.empDeptNumber = empDeptNumber;
		this.empPassword = empPassword;
	}

	/*
	 * data type is a variable object . Object Parameterized constructor TempObject
	 * is a variable of type Employee
	 */
	public Employeee(Employeee tempObject) {
		// employee is a class and class is a user defined data type
		System.out.println("Copy Constructor");
		empNumber = tempObject.empNumber;
		empName = tempObject.empName;
		if ("Contract".contentEquals(tempObject.empType)) {
			empType = "Permanent";
			empBasic = tempObject.empBasic + 1500;
			empComm = tempObject.empComm + 250;

		}
		empPassword = tempObject.empPassword;
		empDeptNumber = tempObject.empDeptNumber;
	}

	public Employeee() {
		System.out.println("Default Constructor");
		empNumber = 222;
		empName = "BBB";
		empType = "Contract";
		empBasic = 10056.34d;
		empComm = 2000;
		empDeptNumber = 20;
		empPassword = "Guest@123";

	}

	public void displayEmployeeDetails() {
		System.out.println("====================================");
		System.out.println("Employee Number:" + '\t' + empNumber);
		System.out.println("Employee Name:" + '\t' + empName);
		System.out.println("Employee Type:" + '\t' + empType);
		System.out.println("Employee Salary:" + '\t' + empBasic);
		System.out.println("Employee Commission:" + '\t' + empComm);
		System.out.println("Employee Department Number:" + '\t' + empDeptNumber);
		System.out.println("====================================");

	}

}
