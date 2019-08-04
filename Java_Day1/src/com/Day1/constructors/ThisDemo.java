package com.Day1.constructors;

public class ThisDemo {
	public static void main(String[] args) {
		System.out.println("Main Method Starts");

		TraineeAssociate traineeAssociate = new TraineeAssociate(200, "Siri", "Java", "NJ", "NY", "NY");
		System.out.println(traineeAssociate);

		TraineeAssociate traineeAssociate2 = new TraineeAssociate(300, "SiNI", "Data science", "NJ");
		System.out.println(traineeAssociate2);
		System.out.println("Main Method Ends");
	}

}
