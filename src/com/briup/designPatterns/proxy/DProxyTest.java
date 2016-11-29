package com.briup.designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DProxyTest {
	public static void main(String[] args) {
		IStudentService target = new IStudentServiceImpl();
		ClassLoader loader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		InvocationHandler h = new MyHandler(target);
		
		IStudentService proxy = (IStudentService) Proxy.newProxyInstance(loader, interfaces, h);
		proxy.delete(1);
		proxy.find(1);
		proxy.save(null);
		
		System.out.println(proxy.toString());
		System.out.println(proxy.getClass());
		System.out.println(target.getClass());
		
	}
}
//student class
class Student{
	private long id;
	private String name;
	private int age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class StudentLog{
	public void log(String msg){
		System.out.println("log:"+msg);
	}
}
interface IStudentService{
	void save(Student s);
	void delete(long id);
	Student find(long id);
}
class IStudentServiceImpl implements IStudentService{

	@Override
	public void save(Student s) {
		System.out.println("Student save....");
	}

	@Override
	public void delete(long id) {
		System.out.println("Student delete...");
	}

	@Override
	public Student find(long id) {
		System.out.println("Student not found");
		return null;
	}
}

class MyHandler implements InvocationHandler{
	private StudentLog stuLog;
	private Object target;
	public MyHandler(){}
	public MyHandler(StudentLog stuLog,Object target){
		this.stuLog = stuLog;
		this.target = target;
	}
	public MyHandler(Object target){
		this.target = target;
		this.stuLog = new StudentLog();
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String msg = method.getName()+" method has been invoke";
		stuLog.log(msg);
		Object o = method.invoke(target, args);
		return o;
	}
	
}



