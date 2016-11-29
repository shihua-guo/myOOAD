package com.briup.designPatterns.adaptor.exercise1;

class Action {
	public void run(){
		System.out.println("Action run");
	}
	public static void main(String[] args){
		CModule c = new CModule();
		c.go(new AdaptorAw());
	}

}
interface Work{
	public void doStart();
	public void doRun();
	public void doEnd();
}
class AdaptorAw extends Action implements Work{

	@Override
	public void doStart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doRun() {
		// TODO Auto-generated method stub
		run();
	}

	@Override
	public void doEnd() {
		// TODO Auto-generated method stub
		
	}
}
class CModule{
	public void go(Work work){
		work.doRun();
	}
}