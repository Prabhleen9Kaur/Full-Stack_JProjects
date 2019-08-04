package com.marlabs.io.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainApplication {
	public static void serializeTheObject(final Customer customer) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectStream = null;
		try {
			fileOutputStream = new FileOutputStream("src/data.txt");
			objectStream = new ObjectOutputStream(fileOutputStream);
			objectStream.writeObject(customer);
			System.out.println("Object Serialized Successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (objectStream != null) {
					objectStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static Customer deSerializeTheObject() {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Customer customer = null;
		try {
			fileInputStream = new FileInputStream("src/data.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			customer = (Customer) object;
			System.out.println("De Serialization Done");
			System.out.println(customer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
				if (objectInputStream != null) {
					objectInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return customer;
	}

	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		System.out.println("*****************************");
		System.out.println("1) Serialize The Object");
		System.out.println("2) De-Serialize The Object");
		// JDK 1.5 Version Updation
		Scanner scanner = new Scanner(System.in); // System.in Represents
													// Keyboard
		Customer customer = new Customer("CUS001", "Abc Traders", "Guest@123",
				570048, "Hyderabad");
		Customer customer2 = null;
		System.out.println("Enter The Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			serializeTheObject(customer);
			break;
		case 2:
			customer2 = deSerializeTheObject();
			if (customer == customer2) {
				System.out.println("Same Memory Location");
			} else {
				System.out
						.println("De-Serialization Will Return New Memory Location");
			}
			break;
		default:
			System.exit(0); // Successful Termination Of JVM
			break;
		}
		scanner.close();
		System.out.println("*****************************");
		System.out.println("End Of Main Method");
	}
}
