package com.marlabs.io.examples;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class MySingleTon implements Serializable, Cloneable {
	private static MySingleTon mySingleTonInstance = null;
	private Map<String, String> loginDetailsMap;
	private static boolean singleTonFlag = false;

	// T1 T20 T10
	public synchronized static MySingleTon getInstance()
			throws InstantiationException {
		if (mySingleTonInstance == null) {
			mySingleTonInstance = new MySingleTon();
			singleTonFlag = true;
			mySingleTonInstance.loadUserDetails();
		}
		return mySingleTonInstance;
	}

	// This Is For Eliminating Object Creation From Reflection API
	private MySingleTon() throws InstantiationException {
		System.out.println("I AM From MySingleTon Cons");
		if (singleTonFlag) {
			throw new InstantiationException(
					"Not Possible To Create The Object");
		}
		loginDetailsMap = new HashMap<String, String>();
	}

	/*
	 * De-Serialization Related
	 */
	// implement readResolve method
	protected Object readResolve() {
		System.out.println("From readResolve Method");
		return mySingleTonInstance;
	}

	// This is for Eliminating The Cloning Possibility
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();
		return new CloneNotSupportedException(
				"Cloning Not Allowed Bcz Its A Singleton Object");
	}

	private void loadUserDetails() {
		System.out
				.println("UserName -PassWord Combinations Loaded Successfully");

		loginDetailsMap.put("C001", "CT@123");
		loginDetailsMap.put("C002", "CT0@123");
		loginDetailsMap.put("C003", "MyGuest@123");
		loginDetailsMap.put("C004", "Guest@123");
		loginDetailsMap.put("C005", "CT@321");
	}

	public boolean validateUserDetails(String userName, String userPassWord) {
		boolean validationFlag = false;
		if (loginDetailsMap.containsKey(userName)) {
			if (loginDetailsMap.get(userName).equals(userPassWord)) {
				validationFlag = true;
			}
		}
		return validationFlag;
	}
}
