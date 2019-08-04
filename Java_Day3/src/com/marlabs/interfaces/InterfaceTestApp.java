package com.marlabs.interfaces;

public class InterfaceTestApp {
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");

		InterImplClass obInterImplClass = new InterImplClass();
		obInterImplClass.f1();
		obInterImplClass.f2();
		obInterImplClass.f3();
		obInterImplClass.f4();
		obInterImplClass.f5();

		System.out.println("By Using Dynamic Binding Approach");
		System.out.println("With Inter2 Reference");
		// Inter1 i1 = new Inter1();
		// Inter1 object = null;
		Inter2 object = null;
		object = new InterImplClass();
		object.f1();
		object.f2();
		object.f3();

		System.out.println("End Of Main Method");
	}
}
