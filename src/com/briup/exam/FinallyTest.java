package com.briup.exam;

public class FinallyTest {
	public static void main(String[] args) {
		System.out.println(test().name);
		
	}
	static public TempStu test(){
		TempStu stu = null ;
		try {
			stu = new TempStu("alan");
			int[] arr = new int[1];
			for(int i=0;i<5;i++){
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("z");
			return stu;
		} finally{
			stu = new TempStu("jade");
		} 
		return null;
		
	}
}
class TempStu{
	protected String name;
	public TempStu(){}
	public TempStu(String name){
		this.name = name;
	}
	
}
