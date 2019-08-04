package com.marlabs.typesofrelations;

import java.util.HashMap;
import java.util.Map;

public class MySingleTon {
	private static MySingleTon mySingleTonInstance = null;
	private Map<String, String> loginDetailsMap;

	// T1 T20 T10
	public synchronized static MySingleTon getInstance() {
		if (mySingleTonInstance == null) {
			mySingleTonInstance = new MySingleTon();
			mySingleTonInstance.loadUserDetails();
		}
		return mySingleTonInstance;
	}

	private MySingleTon() {
		System.out.println("I AM From MySingleTon Cons");
		loginDetailsMap = new HashMap<String, String>();
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
