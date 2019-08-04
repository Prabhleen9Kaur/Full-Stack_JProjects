package com.marlabs.utilpgms;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		Random random = new Random();
		int intrandomValue = random.nextInt();
		System.out.println(intrandomValue);
		System.out.println(Math.abs(intrandomValue));

		intrandomValue = random.nextInt(1000);
		System.out.println(intrandomValue);

		System.out.println(random.nextFloat());
		System.out.println(random.nextDouble());
		System.out.println(random.nextBoolean());
		System.out.println(random.nextLong());

		System.out.println(Math.random()); // java.lang.Math - 0.0 to 1.0
		System.out.println("End Of Main Method");
	}
}
