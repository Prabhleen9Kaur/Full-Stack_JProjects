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
		// we wont get error if we place it inside an instance block or instance method.
	//initialisation is a work and in java every action is performed with respect to a method so it is necessary to do initialisation inside a method or instance block
	}

	void display() {
		System.out.println(i);
	}
}

public class MainApp {
	public static void main(String[] args) {

	}
}