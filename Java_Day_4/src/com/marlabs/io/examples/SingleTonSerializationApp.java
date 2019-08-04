package com.marlabs.io.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SingleTonSerializationApp {
	public static void serializeTheObject(final MySingleTon singleTonInstance) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectStream = null;
		try {
			fileOutputStream = new FileOutputStream("src/data2.txt");
			objectStream = new ObjectOutputStream(fileOutputStream);
			objectStream.writeObject(singleTonInstance);
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

	public static MySingleTon deSerializeTheObject() {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		MySingleTon singleTonInstance = null;
		try {
			fileInputStream = new FileInputStream("src/data2.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			singleTonInstance = (MySingleTon) object;
			System.out.println("De Serialization Done");
			System.out.println(singleTonInstance);
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
		return singleTonInstance;
	}

	public static void main(String[] args) throws InstantiationException {
		System.out.println("I Am From Main Method");
		System.out.println("*****************************");
		System.out.println("1) Serialize The Singleton Object");
		System.out.println("2) De-Serialize The Singleton Object");
		// JDK 1.5 Version Updation
		Scanner scanner = new Scanner(System.in); // System.in Represents
													// Keyboard
		MySingleTon singleTon = MySingleTon.getInstance();
		MySingleTon singleTon2 = null;
		System.out.println("Enter The Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			serializeTheObject(singleTon);
			break;
		case 2:
			singleTon2 = deSerializeTheObject();
			boolean loginFlag = singleTon2
					.validateUserDetails("C001", "CT@123");
			if (loginFlag) {
				System.out.println("Login Success");
			}
			if (singleTon == singleTon2) {
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
