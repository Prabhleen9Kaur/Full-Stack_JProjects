package com.marlabs.interfaceactivity;

public interface IEmployee {

	public abstract void setEmpPassWord(final String empPassWord);

	public abstract String getEmpPassWord();

	public abstract void doSalaryCaliculation();

	public abstract void displaySalaryStatement();

	double HRA_PERCENTILE = 0.04; // public final static double
									// HRA_PERCENTILE=0.04;

	public final static double DA_PERCENTILE = 0.03d;
}
/*
 * 1) In Interfaces we are defining the protocols to be followed 2) Via
 * interface's and abstract methods we are achieving the Data Abstraction
 */