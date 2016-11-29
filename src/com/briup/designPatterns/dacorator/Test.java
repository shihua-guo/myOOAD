package com.briup.designPatterns.dacorator;
/**
 * 装饰模式的简介
 * @author alan
 * @date Sep 2, 2016 3:45:49 PM
 */
public class Test {
	public static void main(String[] args) {
		Action p = new Person();
		
		Action a = new Person();
		System.out.print("i am person:");
		a.go();		
		a = new Dacorator(p);
		System.out.print("i am a docorator:");
		a.go();
		
		a = new ListenDacorator(p);
		System.out.print("i am ListenDacorator:");
		a.go();
		
		a = new RelaxDacorator(p);
		System.out.print("i am RelaxDacorator:");
		a.go();
		
		a = new RelaxDacorator(new ListenDacorator(p));
		System.out.print("i am Listen an Relax:");
		a.go();
		
		a = new ListenDacorator(new RelaxDacorator(p));
		System.out.print("i am Relax and Listen:");
		a.go();
	}
}

interface Action{
	public void go();
}
//Person 实现Action
class Person implements Action{
	@Override
	public void go() {
		System.out.println("i am going");
	}
}
//装饰类
class Dacorator implements Action{
	private Action action;
	public Dacorator(){}
	public Dacorator(Action action){
		this.action = action;
	}
	@Override
	public void go() {
		action.go();
	}
}
//在go之前添加一个listen动作
class ListenDacorator extends Dacorator{
	public ListenDacorator(){}
	public ListenDacorator(Action action){
		super(action);
	}
	public void go() {
		listen();
		super.go();
	}
	public void listen(){
		System.out.println("i am listening");
	}
}
//继续装饰原有的装饰类，在go之后添加休息的方法
class RelaxDacorator extends Dacorator{
	public RelaxDacorator(){}
	public RelaxDacorator(Action action){
		super(action);
	}
	public void go(){
		super.go();
		relax();
	}
	public void relax(){
		System.out.println("i am relaxing");
	}
}
