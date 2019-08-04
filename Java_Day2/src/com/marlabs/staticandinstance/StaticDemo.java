package com.marlabs.staticandinstance;

class Demo {
	int a;
	static int b;

	void init(int a) {
		this.a = a; //'this' keyword used with current class variable to avoid ambiguity b/w instance variable and formal parameter name ,we use 
	}

	void display() {
		System.out.println("A value is:" + a);
		
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		System.out.println("b value is:" + Demo.b);
		Demo.b = 2000;
		Demo demo = new Demo();
		demo.display();
		demo.a = 201;
		demo.display();
		Demo.b = 1500;
		Demo demo2 = new Demo();
		demo2.display();
		demo2.init(Demo.b);
		demo2.display();
		System.out.println("End OF Main Method");
	}
}
