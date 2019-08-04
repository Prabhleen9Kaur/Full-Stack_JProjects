package com.marlabs.staticandinstance;

public class StaticDemo1 {
	static int b;
	
// instance method
	public void f1() {
		System.out.println("I Am From f1 instance Method");
	}

	// instance method
	public void f2() {
		System.out.println("I Am From f2 instance Method");
		f1(); // Rule-1
		f3(); // Rule-4
		System.out.println(Math.round(10.2536489d)); // Rule-4
	}

	// static method
	public static void f3() {
		System.out.println("I Am From f3 static Method");
	}

	static {
		System.out.println("I Am From static Block-2");
		System.out.println("b value:" + b);
		b = 3001;
	}

	public StaticDemo1() {
		System.out.println("I Am From StaticDemo1 Cons");
	}

	{
		System.out.println("Instance Block-2");
	}

	public static void main(String[] args) {
		System.out.println("I AM From Main Method");
		f3(); // Rule-2

		// f2();
		StaticDemo1 demo1 = new StaticDemo1();
		demo1.f2(); // Rule-3
		System.out.println("End Of Main Method");
	}

	{
		System.out.println("Instance Block-1");
	}
	static {
		System.out.println("I AM From static Block-1");
		Demo demo = new Demo();
		demo.init(2000);
		demo.display();
		System.out.println("b variable value:" + b);
		// StaticDemo1 demo1 = new StaticDemo1();
	}

}
