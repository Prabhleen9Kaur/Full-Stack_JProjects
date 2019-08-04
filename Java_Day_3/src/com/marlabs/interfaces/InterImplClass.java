package com.marlabs.interfaces;

public class InterImplClass extends C1 implements Inter2, Inter3 {

	@Override
	public void f1() {
		System.out.println("I AM From f1 Method");
	}

	@Override
	public void f2() {
		System.out.println("I AM From f2 Method");
	}

	@Override
	public void f4() {
		System.out.println("I AM From f4 Method");
	}

	@Override
	public void f3() {
		System.out.println("I AM From f3 Method");
	}

	@Override
	public void f5() {
		System.out.println("I Am From f5 Method Re Defined In Impl Class");
	}
}
