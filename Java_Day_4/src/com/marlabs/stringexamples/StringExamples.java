package com.marlabs.stringexamples;

import java.util.Arrays;
import java.util.Scanner;

public class StringExamples {
	// Input : "EARTH"
	// Output : "EARTH||HTRAE"
	public static String mirrorImage(final String input) {
		final String METHOD_NAME = "mirrorImage";
		String outputString = null;
		System.out.println("Method Invoked:" + METHOD_NAME + ":" + input);
		outputString = input.concat("||").concat(
				new StringBuffer(input).reverse().toString());
		System.out.println("Response From The Method:" + METHOD_NAME + ":"
				+ outputString);
		return outputString;
	}

	// { "A23@3QW", "23QW34A2", "3ASD4", "#sd45sdf","ASDS@#2"};
	public static int getAllDigitsSum(final String input[]) {
		final String METHOD_NAME = "getAllDigitsSum";
		int digitsSum = 0;
		System.out.println("Method Invoked:" + METHOD_NAME + ":"
				+ Arrays.toString(input));
		// Business Logic
		for (String str : input) {
			// System.out.println(str);
			char ch[] = str.toCharArray();
			for (char c : ch) {
				// System.out.println(c);
				if (Character.isDigit(c)) {
					// digitsSum = digitsSum + (int)c; // It is Wrong
					// 5- Ascii Value -53
					// 0- Ascii Value -48
					digitsSum = digitsSum + (c - '0');
					// digitsSum = digitsSum + Character.getNumericValue(c);
				}
			}
		}
		System.out.println("Response From The Method:" + METHOD_NAME + ":"
				+ digitsSum);
		return digitsSum;
	}

	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		System.out.println("CH1) Mirror Image Example");
		System.out.println("CH2) Digits Sum Example");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice");
		String choice = scanner.next();
		// JDK 1.7 Version Feature
		switch (choice) {
		case "CH1":
			String result = mirrorImage("EARTH");
			System.out.println("Output Is:" + result);
			break;

		case "CH2":
			String input[] = { "A23@3QW", "23QW34A2", "3ASD4", "#sd45sdf",
					"ASDS@#2" };
			int digitsSum = getAllDigitsSum(input);
			System.out.println("Output Is:" + digitsSum);
			break;
		default:
			System.out.println("Enter Correct Choice");
			System.exit(0);
			break;
		}
		scanner.close();
		System.out.println("End Of Main Method");
	}
}
