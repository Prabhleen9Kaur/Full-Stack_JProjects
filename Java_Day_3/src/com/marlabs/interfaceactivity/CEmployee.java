package com.marlabs.interfaceactivity;

public class CEmployee extends Employee {
	float perDaySalary;
	float numberOfDays;
	double takeHomeSalary;

	/**
	 * @param empNumber
	 * @param empName
	 * @param empJob
	 * @param empPassWord
	 * @param empDeptNumber
	 * @param perDaySalary
	 * @param numberOfDays
	 */
	public CEmployee(int empNumber, String empName, String empJob,
			String empPassWord, int empDeptNumber, float perDaySalary,
			float numberOfDays) {
		// Super At Constructor Level;
		super(empNumber, empName, empJob, empPassWord, empDeptNumber);
		System.out.println("From CEmployee Class");
		this.perDaySalary = perDaySalary;
		this.numberOfDays = numberOfDays;
	}

	@Override
	public void doSalaryCaliculation() {
		if (empDeptNumber == 10) {
			takeHomeSalary = Math.round(perDaySalary * numberOfDays
					+ (perDaySalary * numberOfDays) * HRA_PERCENTILE
					+ (perDaySalary * numberOfDays) * DA_PERCENTILE);
		} else {
			takeHomeSalary = Math.round(perDaySalary * numberOfDays);
		}
	}

	@Override
	public void displaySalaryStatement() {
		super.displaySalaryStatement();// super at Method Level
		System.out.println("Employee Perday Salary:" + "\t" + perDaySalary);
		System.out.println("Employee Worked Days:" + "\t" + numberOfDays);
		System.out
				.println("Employee Take Home Salary:" + "\t" + takeHomeSalary);
		System.out.println("**********************************************");
	}
}
