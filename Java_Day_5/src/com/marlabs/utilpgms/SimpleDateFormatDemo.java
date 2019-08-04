package com.marlabs.utilpgms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		// "EEE MMM dd HH:mm:ss zzz yyyy";
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy");

		String convertedDateStyle = dateFormatter.format(date);
		System.out.println(convertedDateStyle);

		dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		convertedDateStyle = dateFormatter.format(date);
		System.out.println(convertedDateStyle);

		dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		convertedDateStyle = dateFormatter.format(date);
		System.out.println(convertedDateStyle);
		dateFormatter = new SimpleDateFormat("ddMMyyyy");
		convertedDateStyle = dateFormatter.format(date);
		System.out.println(convertedDateStyle);
		dateFormatter = new SimpleDateFormat("dd/MM-yyyy");
		convertedDateStyle = dateFormatter.format(date);
		System.out.println(convertedDateStyle);

		dateFormatter = new SimpleDateFormat("EEEE");
		convertedDateStyle = dateFormatter.format(date);
		System.out.println(convertedDateStyle);
		dateFormatter = new SimpleDateFormat("MMM");
		convertedDateStyle = dateFormatter.format(date);
		System.out.println(convertedDateStyle);
		dateFormatter = new SimpleDateFormat("MMMM");
		convertedDateStyle = dateFormatter.format(date);
		System.out.println(convertedDateStyle);

		System.out.println("Enter Joining Date [dd-MM-yyyy]");
		Scanner scanner = new Scanner(System.in);
		String joiningDate = scanner.next();
		System.out.println(joiningDate);

		dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date convertedDate = dateFormatter.parse(joiningDate);
			System.out.println(convertedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scanner.close();
		System.out.println("End Of Main Method");
	}
}
