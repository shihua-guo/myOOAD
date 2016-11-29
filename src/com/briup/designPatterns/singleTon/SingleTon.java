package com.briup.designPatterns.singleTon;

public class SingleTon {
	private static SingleTon instance = new SingleTon();
	private SingleTon(){}
	public static SingleTon getInstance(){
		return instance;
	}
	private void hello(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		SingleTon s = SingleTon.getInstance();
		s.hello();
	}
}
