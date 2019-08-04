package com.marlabs.stringexamples;

/**
 * @author srinivasa.challa
 *
 */
public class StringInstanceMethods {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Srinivasa Reddy";
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		char c = s.charAt(10);
		System.out.println(c);

		String s1 = "   Welcome To Strings Applications   ";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		char ch1[] = s2.toCharArray();
		for (char c1 : ch1) {// For Each Loop JDK 1.5 Version Updation
			System.out.println(c1);
		}
		// 10 Chars
		String batchCode = "MYS18AJ005";
		String batchDomain = batchCode.substring(5);
		System.out.println(batchDomain);

		batchDomain = batchCode.substring(5, 7);// 7-1 n-1 =6
		System.out.println(batchDomain);
		/*
		 * if (batchDomain.equals("AJ")) {
		 * System.out.println("Welcome To Java Technology"); }
		 */
		if ("AJ".equals(batchDomain)) {
			System.out.println("Welcome To Java Technology");
		} else if ("DN".equals(batchDomain)) {
			System.out.println("Welcome To Dot Net Tech");
		} else {
			System.out.println("Enter Correct Batch Details");
		}

		System.out.println(s2);
		String ss[] = s2.split("\\s"); // JDK 1.4 java.util.regex.*;
		for (String i : ss) {
			System.out.println(i);
		}

		StringBuffer sss = new StringBuffer("CSREDDY");
		String ssss = sss.toString();
		System.out.println(ssss);

		String a = new String("aaa");
		String b = new String("aaa");
		System.out.println(a.matches(b)); // regular expression

		String a1 = new String("Srinivas");
		String a2 = new String(" Reddy");
		String a3 = a1.concat(a2);
		System.out.println(a3);
		String a4 = a1 + a2;
		System.out.println(a4);

		System.out.println(a1.indexOf('i'));
		System.out.println(a1.lastIndexOf('i'));
		System.out.println(a1.indexOf('z'));

		String myString1 = "Java Application Is Working Fine, And I Love Java";
		System.out.println(myString1.indexOf("Java"));
		System.out.println(myString1.lastIndexOf("Java"));

		System.out.println();

		System.out.println(s2);
		System.out.println(s2.startsWith("Welcome"));
		System.out.println(s2.endsWith("ions"));

		String b1 = new String("Abcz");
		String b2 = new String("Abcz");
		if (b1 == b2) {
			System.out.println("hi hello");
		}
		if (b1.equals(b2)) {
			System.out.println("equals method");
		}
		String b3 = b1;
		if (b3 == b1) {
			System.out.println("Comparing the memory locations");
		}
		String myString = String.valueOf(10);
		System.out.println(myString);

		float f = 10.23f;
		// I Want this to be represented in String Format

		Float floatObject = new Float(f);
		String representation = floatObject.toString();
		System.out.println(representation);

		representation = String.valueOf(f);
		System.out.println(representation);

		StringBuffer stringBuffer = new StringBuffer("Java Application");
		String string = new String("Java Application");
		boolean result = string.equals(stringBuffer);
		System.out.println(result);
		result = string.contentEquals(stringBuffer); // JDK 1.4 Version
		System.out.println(result);

		System.out.println("Example For replace All Method");
		String exString = "Learning Java Is Very Easy";
		// Learning%20Java%20Is%20Very%20Easy

		String replaceexString = exString.replace(" ", "%20"); // regular
																// expression
		System.out.println(replaceexString);
	}
}
