package com.marlabs.utilpgms;

import java.util.Date;

public class DateAPIDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		// "EEE MMM dd HH:mm:ss zzz yyyy";
		Date date = new Date();
		System.out.println(date.toString());
		Date newDate = new Date();
		Date date2 = new Date(2018 - 1900, 04, 10);
		System.out.println(date2);

		Date date3 = new Date(118, 02, 22, 19, 52);
		System.out.println(date3);

		// getTime is returning long Mill Sec's
		Date date4 = new Date(date.getTime());
		System.out.println(date4);

		System.out.println("Year:" + (date.getYear() + 1900));
		System.out.println("Month:" + date.getMonth());
		System.out.println("Date:" + date.getDate());
		System.out.println("Day:" + date.getDay());
		System.out.println("Hours:" + date.getHours());
		System.out.println("Mints:" + date.getMinutes());
		System.out.println("Sec's:" + date.getSeconds());
		System.out.println("Long Mill Sec's:" + date.getTime());
		System.out.println("After Changing the Date Values");
		date.setMonth(1);
		date.setYear(117);
		System.out.println("Year:" + (date.getYear() + 1900));
		System.out.println("Month:" + date.getMonth());
		System.out.println("Date:" + date.getDate());
		System.out.println("Day:" + date.getDay());
		System.out.println("Hours:" + date.getHours());
		System.out.println("Mints:" + date.getMinutes());
		System.out.println("Sec's:" + date.getSeconds());
		System.out.println("Long Mill Sec's:" + date.getTime());
		System.out.println("End OF Main Method");

		boolean result = date.before(date4);
		System.out.println("before:" + result);
		result = date.after(date4);
		System.out.println("after:" + result);
		Date newDate1 = new Date();
		System.out.println(newDate);
		System.out.println(newDate1);
		System.out.println(newDate.getTime());
		System.out.println(newDate1.getTime());
		result = newDate.equals(newDate1);
		System.out.println(result);
	}
}
