package com.briup.exam;

public class ThisConstructorCall {
	public ThisConstructorCall(String s) {
		System.out.println("s = " + s);
	}

	public ThisConstructorCall(int i) {
		this("i = " + i);
	}

	public static void main(String args[])
	{
		new ThisConstructorCall("String call");
		new ThisConstructorCall(47);
	}
}