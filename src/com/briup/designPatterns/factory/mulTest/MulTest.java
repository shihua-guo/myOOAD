package com.briup.designPatterns.factory.mulTest;


public class MulTest {
	public static void main(String[] args) {
		Sender s1 = new SendFactory().produceMail();
		Sender s2 = new SendFactory().produceSms();
		s1.send();
		s2.send();
	}
}
class SendFactory{
	public Sender produceSms(){
		return new SmsSender();
	}
	public Sender produceMail(){
		return new MailSender();
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
