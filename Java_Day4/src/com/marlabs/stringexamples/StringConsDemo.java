package com.marlabs.stringexamples;

public class StringConsDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		String str = new String(); // Cons-1
		int size = str.length();
		boolean isEmpty = str.isEmpty();
		System.out.println("Size:" + size);
		System.out.println("isEmpty?:" + isEmpty);
		System.out.println(str); // str.toString(); // Over Loaded

		String str1 = new String("Java Application"); // Cons-2
		size = str1.length();
		isEmpty = str1.isEmpty();
		System.out.println("Size:" + size);
		System.out.println("isEmpty?:" + isEmpty);
		System.out.println(str1);

		char ch[] = { 'J', 'A', 'V', 'A', 'A', 'P', 'P' };
		String str2 = new String(ch); // Cons-3
		size = str2.length();
		isEmpty = str2.isEmpty();
		System.out.println("Size:" + size);
		System.out.println("isEmpty?:" + isEmpty);
		System.out.println(str2);

		String str3 = new String(ch, 4, 3); // Cons-4
		size = str3.length();
		isEmpty = str3.isEmpty();
		System.out.println("Size:" + size);
		System.out.println("isEmpty?:" + isEmpty);
		System.out.println(str3);
		System.out.println("End Of Main Method");

		StringBuffer stringBuffer = new StringBuffer("Srinivasa ");
		System.out.println(stringBuffer);
		stringBuffer.append(" Reddy");
		System.out.println(stringBuffer);
		stringBuffer.append(" Challa");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.length());
		System.out.println(stringBuffer.capacity());

		// I Wanted to Convert The Mutable Object Into Immutable Object
		// String s = stringBuffer.toString();
		String str4 = new String(stringBuffer); // Cons-5
		System.out.println(str4);

		StringBuilder stringBuilder = new StringBuilder("Srinivasa ");
		stringBuilder.append(" Reddy");
		System.out.println(stringBuilder);
		stringBuilder.append(" Challa");
		System.out.println(stringBuilder);
		// I Wanted to Convert The Mutable Object Into Immutable Object
		String str5 = new String(stringBuilder); // Cons-6
		System.out.println(str5);

		StringBuffer sb = new StringBuffer("Srinivas");
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		String s = new String("Java");
		String s1 = new String("Java");
		System.out.println("Contents:" + s.equals(s1));
		System.out.println("String Cons Approach");
		if (s == s1) {
			System.out.println("Both Memory Locations Were Equal");
		} else {
			System.out.println("Both Memory Locations Were NOT Equal");
		}
		String ss = "Java";
		String ss1 = "Java";
		System.out.println("String Literal Approach");
		if (ss == ss1) {
			System.out.println("Both Memory Locations Were Equal");
		} else {
			System.out.println("Both Memory Locations Were NOT Equal");
		}

		String internString = s1.intern();
		System.out.println(internString);
		internString = ss1.intern();
		System.out.println(internString);
	}
}
