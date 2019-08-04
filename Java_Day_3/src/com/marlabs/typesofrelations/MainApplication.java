package com.marlabs.typesofrelations;

import java.util.HashSet;
import java.util.Set;

public class MainApplication {
	public static void main(String[] args) {
		System.out.println("I AM From Main Method");
		// USES A Relation
		Address localAddress = new Address(6, "#453", "Abc Street", 570023,
				"XYZ City");
		// USES A Relation
		Address permanentAddress = new Address(11, "#201/1", "XYZ Street",
				570048, "ZZZ City");

		// USES A Relation
		Set<Address> addressSet = new HashSet<Address>();
		addressSet.add(localAddress);
		addressSet.add(permanentAddress);

		Employee employee = new Employee(5614, "Srinivas");
		employee.setAddressList(addressSet);
		System.out.println(employee);
		System.out.println("End Of Main Method");
	}
}
