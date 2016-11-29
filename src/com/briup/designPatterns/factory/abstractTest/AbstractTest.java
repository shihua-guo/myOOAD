package com.briup.designPatterns.factory.abstractTest;


public class AbstractTest {
	public static void main(String[] args) {
		Sender s1 = new SmsFactory().produce();
		Sender s2 = new MailFactory().produce();
		s1.send();
		s2.send();
	}
}
interface Sender{
	public void send();
}
class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("i am sms sender");
	}
}
class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("i am mail sender");
	}
	
}
interface SendFactory {
	public Sender produce();
}
class SmsFactory implements SendFactory{

	@Override
	public Sender produce() {
		return new SmsSender();
	}
}
class MailFactory implements SendFactory{

	@Override
	public Sender produce() {
		return new MailSender();
	}
	
}