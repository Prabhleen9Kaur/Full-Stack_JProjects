package com.practice.Day1;

public class Employee {
	int empNumber;
	String empName;
	String empType;
	double empBasic;
	double empComm;
	int empDeptNumber;
	private String empPassword; // scope of this variable is with this class only

	public String getEmpPassword() {
		// To get the value of the employee password
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		// To set the value of the employee password
		this.empPassword = empPassword;
	}

	public void doInitialisation() {
		System.out.println("From doInitialisation default Method");
		empNumber = 222;
		empName = "BBB";
		empType = "Contract";
		empBasic = 10056.34d;
		empComm = 2000;
		empDeptNumber = 20;
		empPassword = "Guest@123";
	}

	public void doInitialisation(int empNumber, String empName, String empType, double empBasic, double empComm,
			int empDeptNumber, String empPassword) {
		System.out.println("From doInitialisation Parameterized Method");
		this.empNumber = empNumber;// this keyword at variable level
		this.empName = empName;
		this.empType = empType;
		this.empBasic = empBasic;
		this.empComm = empComm;
		this.empDeptNumber = empDeptNumber;
		this.empPassword = empPassword;
// Java gives highest priority to local variable
		// To eliminate the confusion between formL VARIABLE AND INSTANCE VARIABLE WE
		// USE
		// THE THIS KEYWORD
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
