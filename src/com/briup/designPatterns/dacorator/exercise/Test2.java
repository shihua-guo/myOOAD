package com.briup.designPatterns.dacorator.exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 装饰模式的作业
 * @author alan
 * @date Sep 2, 2016 3:46:33 PM
 */
public class Test2 {
	public static void main(String[] args){
		Action a = new Person();
		a = new PrefixDacorator(new TimeDacorator(new Person("tom")));
		a.say();
	}
	
}
interface Action{
	public void say();
}
class Person implements Action{
	private String name;
	public Person(){}
	public Person(String name){
		this.name = name;
	}
	@Override
	public void say() {
		System.out.print("Hello "+name);
	}
}
class Dacorator implements Action{
	private Action action;
	public Dacorator(){}
	public Dacorator(Action action){
		this.action = action;
	}
	@Override
	public void say() {
		action.say();
	}
}
class PrefixDacorator extends Dacorator {
	public PrefixDacorator (){}
	public PrefixDacorator (Action action){
		super(action);
	}
	@Override
	public void say() {
		prefix();
		super.say();
	}
	public void prefix(){
		System.out.print("briup_");
	}
}

class TimeDacorator extends Dacorator{
	public TimeDacorator(){}
	public TimeDacorator(Action action){
		super(action);
	}
	@Override
	public void say() {
		super.say();
		time();
	}
	public void time(){
		System.out.println(" "+getTime());
	}
	public String getTime(){
		Date date = new Date();
		DateFormat dateFor = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFor.format(date);
	}
}