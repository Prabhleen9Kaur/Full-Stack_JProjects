package com.marlabs.staticandinstance;

import java.util.HashMap;
import java.util.Map;

public class MySingleTon {
	//to prevent access outside of class, make private static
	private static MySingleTon mySingleTonInstance = null;

	// T1 T20 T10
	// will return same instance created previously
	// this is a public and static method so we can call it as factory method.
	//even though multiple threads are trying to access this getInstance method , so we use synchronised keyword to allow only one thread to access this same method at one point of time. 
	public synchronized static MySingleTon getInstance() {
		// if it instance is null then it will create else it will return the previously created
		if (mySingleTonInstance == null) {
			mySingleTonInstance = new MySingleTon();
		}
		return mySingleTonInstance;
	}

	//private constructor
	//this is singleton object creation
	private MySingleTon() {
		System.out.println("I AM From MySingleTon Cons");
	}

	public void loadUserDetails() {
		System.out.println("UserName -PassWord Combinations");
		//Map collection used to get details of login from database
		Map<String, String> loginDetailsMap = new HashMap<String, String>();
		loginDetailsMap.put("C001", "CT@123");
		loginDetailsMap.put("C002", "CT0@123");
		loginDetailsMap.put("C003", "MyGuest@123");
		loginDetailsMap.put("C004", "Guest@123");
		loginDetailsMap.put("C005", "CT@321");
	}
}
