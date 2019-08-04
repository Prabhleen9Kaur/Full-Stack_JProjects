package com.marlabs.utilpgms;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		// "EEE MMM dd HH:mm:ss zzz yyyy";
		Date date = new Date();
		System.out.println(date);

		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.LONG,
				Locale.ENGLISH);
		String convertedDateStyle = dateFormatter.format(date);
		System.out.println("Long:" + convertedDateStyle);

		dateFormatter = DateFormat.getDateInstance(DateFormat.FULL,
				Locale.ENGLISH);
		convertedDateStyle = dateFormatter.format(date);
		System.out.println("Full:" + convertedDateStyle);

		dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT,
				Locale.ENGLISH);
		convertedDateStyle = dateFormatter.format(date);
		System.out.println("Short:" + convertedDateStyle);

		dateFormatter = DateFormat.getDateInstance(DateFormat.LONG,
				Locale.CHINESE);
		convertedDateStyle = dateFormatter.format(date);

		System.out.println("Long:" + convertedDateStyle);
		DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINESE);

		convertedDateStyle = dateFormatter.format(date);
		System.out.println("Full:" + convertedDateStyle);

		dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT,
				Locale.CHINESE);

		convertedDateStyle = dateFormatter.format(date);
		System.out.println("Short:" + convertedDateStyle);

		System.out.println("End Of Main Method");
	}
}
