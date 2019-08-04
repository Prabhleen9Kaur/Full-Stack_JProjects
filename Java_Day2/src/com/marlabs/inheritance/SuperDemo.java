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
	void init(int i) { // i is Formal Parameter
		this.i = i;// highest priority given ti formal parameter
		super.init(i - 10); // super At Method Level
	}

	// super at variable level
	void display() {
		System.out.println("The Value Of i In Abc Class Is:" + super.i);
		//bse class i variable , we use super
	}
}

class Abcde extends Abcd {
	int i;

	@Override
	void init(int i) {
		this.i = i//formal i parameter vaiable;
				// this.i means abcd class variable
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
