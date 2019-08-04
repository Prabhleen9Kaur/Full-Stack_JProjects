package com.marlabs.inheritance;

class Demo {
	int i;

	public Demo() {
		System.out.println("Demo Default Cons");
		i = 10;
	}

	public Demo(int i) {
		System.out.println("Demo Parameterized Cons");
		this.i = i;
	}
}

class Demo1 extends Demo {
	int i;

	public Demo1() {
		// super(); it is an implicit call
		// super(200); // it is not implicit
		System.out.println("I Am From Demo1 Cons");
		this.i = super.i;
	}

	public Demo1(int i) {
		super(200); // it is not implicit
		System.out.println("I Am From Demo1 Parameterized Cons");
		this.i = i;
	}

	public void display() {
		System.out.println("Base Class i variable value:" + "\t" + super.i);
		System.out.println("Sub Class i variable value:" + "\t" + i);
	}
}

public class SuperDemo1 {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		Demo1 demo1 = new Demo1();
		demo1.display();

		Demo1 demo12 = new Demo1(250);
		demo12.display();
		System.out.println("End Of Main Method");
	}
}
