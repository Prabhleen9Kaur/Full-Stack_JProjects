package com.marlabs.stringexamples;

/**
 * @author srinivasa.challa
 *
 */
public class StringBufferApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(" is ");
		sb.append("Hot"); // concatenation
		sb.append('!');
		sb.insert(0, "Java");
		sb.append('\n');
		sb.append("This is ");
		sb.append(true);
		System.out.println(sb);
		System.out.println(sb.charAt(6));
		sb.setCharAt(21, 'T');
		sb.append('\n');
		sb.append("Java is #");
		sb.append(1);
		System.out.println(sb);
		System.out.println("Converting StingBuffer Object to String");
		String s = sb.toString();
		System.out.println(s);

		sb.reverse();
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());

	}
}
