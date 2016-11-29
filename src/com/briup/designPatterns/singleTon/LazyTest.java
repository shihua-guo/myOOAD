package com.briup.designPatterns.singleTon;

public class LazyTest {
	
}
class LazySingle {
	private static LazySingle instance= null;
	private LazySingle(){
	}
	public static LazySingle getInstance(){
		if(instance==null){
			instance = new LazySingle();
		}
		return instance;
	}
}