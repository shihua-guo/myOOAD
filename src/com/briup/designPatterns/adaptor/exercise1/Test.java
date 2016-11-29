package com.briup.designPatterns.adaptor.exercise1;
public class Test{
	public static void main(String[] args) {
		Adaptor a = new Adaptor();
		a.method1();
		a.method2();
		Wrapper w = new Wrapper(new Source());
		w.method1();
		w.method2();
	}
}
class Source {
	public void method1(){
		System.out.println("this is the original method");
	}
	
}
interface Targetable{
	public void method1();
	public void method2();
}

//类适配器
class Adaptor extends Source implements Targetable{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is targetable method2");
	}
}
//对象适配器
class Wrapper implements Targetable{
	private Source s;
	public Wrapper(){}
	public Wrapper(Source s){
		this.s = s;
	}
	@Override
	public void method1() {
		s.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is targetable method2");
	}
	
}

//接口适配器
interface Sourceable{
	public void method1();
	public void method2();
	public void method3();
	public void method4();
	public void method5();
}
abstract class AdaptorIn implements Sourceable{
	public void method1(){
		System.out.println("i am override method1");
	}
}