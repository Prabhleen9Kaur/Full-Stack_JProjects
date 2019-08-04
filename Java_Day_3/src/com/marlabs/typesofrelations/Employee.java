package com.marlabs.typesofrelations;

import java.util.Set;

public class Employee {
	int empNumber;
	String empName;
	/*
	 * private Address localAddress; // HAS A Relation private Address
	 * permanentAddress; // Aggregation Relation
	 */
	// HAS A Relation
	// Aggregation Relation
	private Set<Address> addressList; // One to Many Relation

	/**
	 * @param empNumber
	 * @param empName
	 */
	public Employee(int empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
	}

	public Set<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<Address> addressList) {
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName
				+ ", addressList=" + addressList + "]";
	}

}
