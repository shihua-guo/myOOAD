package com.briup.exam;

public class Rabbit2 {
public static void main(String[] args) {
System.out.println("第1个月的兔子对数:    1");
System.out.println("第2个月的兔子对数:    1");
int f1 = 1, f2 = 1, f, M=24;
     	for(int i=3; i<=M; i++) {  //3 4 5 6
      		f = f2;                   //1 2 3 5
      		f2 = f1 + f2;             //2 3 5 8
      		f1 = f;                   //1 2 3 5
      		System.out.println("第" + i +"个月的兔子对数: "+f2);
        }
}
}
