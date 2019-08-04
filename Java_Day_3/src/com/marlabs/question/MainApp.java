package com.marlabs.question;

class Demo {
	protected int i;
}

class Demo1 extends Demo {
}

class Demo2 extends Demo1 {
	// i = 20; // I Am Getting Compile Time Error
	void init() {
		i = 20;
	}

	void display() {
		System.out.println(i);
	}
}

public class MainApp {
	public static void main(String[] args) {

	}
}