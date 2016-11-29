package com.briup.designPatterns.factory.staticTest;


public class StaticTest {
	public static void main(String[] args) {
		Sender s1 = new SendFactory().produceSms();
		Sender s2 = new SendFactory().produceMail();
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
class SendFactory{
	public static Sender produceSms(){
		return new SmsSender();
	}
	public static Sender produceMail(){
		return new MailSender();
	}
}

