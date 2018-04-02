package com.framework.xx.threadtest;

public class Test {
	
	public static void main(String [] a) throws InterruptedException {
		
			Model m=new Model();
		
			Produce p=new Produce(m);
			
			new Thread(p).start();
			
			Consumer c=new Consumer(m);
			
			new Thread(c).start();
		
	}

}
