package com.marlabs.utilpgms;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		String stringExample = "Learning Java Is Very Easy With Hands On ";
		String str[] = stringExample.split(" ");// regex
		System.out.println(Arrays.toString(str));
		System.out.println("Size:" + str.length);

		StringTokenizer tokenizer = new StringTokenizer(stringExample);
		System.out.println("Size:" + tokenizer.countTokens());
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		stringExample = "Learning@ Java@ Is @Very @Easy @With @Hands @On ";
		tokenizer = new StringTokenizer(stringExample, "@");
		System.out.println("Size:" + tokenizer.countTokens());

		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken().trim());
		}

		System.out.println("End Of Main Metho");
	}
}
