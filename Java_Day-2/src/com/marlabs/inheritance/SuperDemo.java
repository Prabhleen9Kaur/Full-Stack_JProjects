package com.marlabs.inheritance;

class Abc {
	int i;

	void init(int i) {
		this.i = i;
	}
}

class Abcd extends Abc {
	int i;

	@Override
	void init(int i) { // Formal Parameter
		this.i = i;
		super.init(i - 10); // super At Method Level
	}

	// super at variable level
	void display() {
		System.out.println("The Value Of i In Abc Class Is:" + super.i);
	}
}

class Abcde extends Abcd {
	int i;

	@Override
	void init(int i) {
		this.i = i;
		super.init(i + 100);
	}

	@Override
	void display() {
		super.display(); // super at Method Level
		System.out.println("The Value Of i In Abcd Class:" + super.i);
		System.out.println("The Value Of i Is:" + i);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		Abcde demo = new Abcde();
		demo.init(100);
		demo.display();
	}
}
