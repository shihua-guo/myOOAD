package com.briup.exam;

public class Rabbit {
	private static int count;
	private static int loop=1;
	public static void main(String[] args) {
		birthRabbit();
	}
	public static void birthRabbit() {
		int i=1;
		loop*=2;
		while(true){
			if(i%3==0){
				count+=loop;
				System.out.println("第"+(i+(loop/2))+"有:"+count+"只");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				birthRabbit();
			}
			i++;
		}
	}
}
