package com.marlabs.utilpgms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DateExamples {
	public static String getWeekDayName(final String inputDate,
			final String dateStyle) throws ParseException {
		final String METHOD_NAME = "getWeekDayName";
		String weekDayName = null;
		System.out.println("Method Invoked:" + METHOD_NAME + ":" + inputDate
				+ ":" + dateStyle);
		// Business Logic
		SimpleDateFormat dateFormatter = new SimpleDateFormat(dateStyle);
		Date convertedDate = dateFormatter.parse(inputDate);
		dateFormatter = new SimpleDateFormat("EEEE");
		weekDayName = dateFormatter.format(convertedDate);
		System.out.println("Response From The Method:" + METHOD_NAME + ":"
				+ weekDayName);
		return weekDayName;
	}

	public static String getMonthName(final String inputDate,
			final String dateStyle) throws ParseException {
		final String METHOD_NAME = "getMonthName";
		String monthName = null;
		System.out.println("Method Invoked:" + METHOD_NAME + ":" + inputDate
				+ ":" + dateStyle);
		// Business Logic
		SimpleDateFormat dateFormatter = new SimpleDateFormat(dateStyle);
		Date convertedDate = dateFormatter.parse(inputDate);
		dateFormatter = new SimpleDateFormat("MMMM");
		monthName = dateFormatter.format(convertedDate);
		System.out.println("Response From The Method:" + METHOD_NAME + ":"
				+ monthName);
		return monthName;
	}

	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter The Date Style");
			String dateStyle = scanner.next();
			System.out.println("Enter Birth Day Date");
			String inputDate = scanner.next();
			String weekDayName = getWeekDayName(inputDate, dateStyle);
			System.out.println("Your Birth Day is Fall On:" + weekDayName);
			String monthName = getMonthName(inputDate, dateStyle);
			System.out.println("Your Birth Day is Fall In The Month Of:"
					+ monthName);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		System.out.println("End Of Main Method");
	}
}
