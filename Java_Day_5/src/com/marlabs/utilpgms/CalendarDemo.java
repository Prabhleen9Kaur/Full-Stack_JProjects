package com.marlabs.utilpgms;

import java.util.Calendar;
import java.util.Date;

/**
 * @author srinivasa.challa
 *
 */
public class CalendarDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		// Calendar c = new GregorianCalendar();
		Calendar cal = Calendar.getInstance(); //
		System.out.println(cal);
		/*
		 * get(); set();
		 */
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));

		cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
		System.out.println(cal.get(Calendar.MONTH));
		cal.set(Calendar.MONTH, 05);
		System.out.println("Todays Date Info");
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println("After Adding The Dates");
		cal.add(Calendar.DATE, 60);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));

		System.out.println("Subtracting The Dates");
		cal.add(Calendar.DATE, -60);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));

		System.out.println("roll method");
		System.out.println("Changing the month to 10th");
		cal.set(Calendar.MONTH, 10);

		cal.roll(Calendar.DATE, 15);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		cal.roll(Calendar.DATE, -60);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));

	}
}
