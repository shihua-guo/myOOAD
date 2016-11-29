package com.briup.designPatterns.factory.command;

public class CommandTest {
	public static void main(String[] args) {
		Sender sender1 = new SendFactory().producer("sms");
		Sender sender2 = new SendFactory().producer("mail");
		sender1.send();
		sender2.send();
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
	public Sender producer(String type){
		if("sms".equals(type)){
			return new SmsSender();
		}
		else if("mail".equals(type)){
			return new MailSender();
		}else{
			return null;
		}
	}
}