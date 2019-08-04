package com.marlabs.interfaceactivity;

public class PEmployee extends Employee {
	double empBasic;
	double empCommission;
	double takeHomeSalary;

	/**
	 * @param empNumber
	 * @param empName
	 * @param empJob
	 * @param empPassWord
	 * @param empDeptNumber
	 * @param empBasic
	 * @param empCommission
	 */
	public PEmployee(int empNumber, String empName, String empJob,
			String empPassWord, int empDeptNumber, double empBasic,
			double empCommission) {
		// super at constructor level
		super(empNumber, empName, empJob, empPassWord, empDeptNumber);
		System.out.println("From PEmployee Cons");
		this.empBasic = empBasic; // this at variable level
		this.empCommission = empCommission;
	}

	@Override
	public void doSalaryCaliculation() {
		if (empDeptNumber == 10) {
			takeHomeSalary = Math.round(empBasic + empBasic * DA_PERCENTILE
					+ empBasic * HRA_PERCENTILE + empCommission + 1500);
		} else if (empDeptNumber == 20) {
			takeHomeSalary = Math.round(empBasic + empBasic * DA_PERCENTILE
					+ empBasic * HRA_PERCENTILE + empCommission);
		} else {
			takeHomeSalary = Math.round(empBasic + empCommission);
		}
	}

	@Override
	public void displaySalaryStatement() {
		super.displaySalaryStatement();// super at Method Level
		System.out.println("Employee Basic Salary:" + "\t" + empBasic);
		System.out.println("Employee Commission:" + "\t" + empCommission);
		System.out
				.println("Employee Take Home Salary:" + "\t" + takeHomeSalary);
		System.out.println("**********************************************");
	}
}
