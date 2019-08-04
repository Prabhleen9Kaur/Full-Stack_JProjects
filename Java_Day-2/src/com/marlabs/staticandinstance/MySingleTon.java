package com.marlabs.staticandinstance;

import java.util.HashMap;
import java.util.Map;

public class MySingleTon {
	private static MySingleTon mySingleTonInstance = null;

	// T1 T20 T10
	public synchronized static MySingleTon getInstance() {
		if (mySingleTonInstance == null) {
			mySingleTonInstance = new MySingleTon();
		}
		return mySingleTonInstance;
	}

	private MySingleTon() {
		System.out.println("I AM From MySingleTon Cons");
	}

	public void loadUserDetails() {
		System.out.println("UserName -PassWord Combinations");
		Map<String, String> loginDetailsMap = new HashMap<String, String>();
		loginDetailsMap.put("C001", "CT@123");
		loginDetailsMap.put("C002", "CT0@123");
		loginDetailsMap.put("C003", "MyGuest@123");
		loginDetailsMap.put("C004", "Guest@123");
		loginDetailsMap.put("C005", "CT@321");
	}
}
