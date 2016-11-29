package com.briup.designPatterns.proxy;

public class Test {
	public static void main(String[] args) {
		HelloService client = new  HelloServiceImpl();
		HelloService proxy = new HelloServiceProxy(client);
		proxy.sayHello();
	}
}

//公共接口
interface HelloService{
	public void sayHello();
}
//委托
class HelloServiceImpl implements HelloService{
	@Override
	public void sayHello() {
		System.out.println("Hello.....");
	}
	
}
//代理类
class HelloServiceProxy implements HelloService{
	private HelloService client;
	public HelloServiceProxy (){}
	public HelloServiceProxy (HelloService client){
		this.client = client;
	}
	@Override
	public void sayHello() {
		System.out.println("i am proxy now helping excuting");
		client.sayHello();
	}
}