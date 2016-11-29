package com.briup.designPatterns.facade;

public class FacadeTest {
	public static void main(String[] args) {
		Facade f = new Facade();
		f.start();
		f.run();
		f.end();
		f.service();
	}
}

class A {
	public void start() {
		System.out.println("i am A's Start");
	}
}

class B {
	public void run() {
		System.out.println("i am B's Run");
	}
}

class C {
	public void end() {
		System.out.println("i am C's End");
	}
}

class Facade {
	private A a;
	private B b;
	private C c;

	public Facade() {
		a = new A();
		b = new B();
		c = new C();
	}

	public void start() {
		a.start();
	}

	public void run() {
		b.run();
	}

	public void end() {
		c.end();
	}
	public void service(){
		start();
		run();
		end();
	}
}
