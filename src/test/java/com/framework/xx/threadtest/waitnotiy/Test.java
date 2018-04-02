package com.framework.xx.threadtest.waitnotiy;

public class Test {
	
	public static void main(String [] a) {
		
		Storage s=new Storage();
		
		new Produce(s).start();
		
		new Consumer(s).start();
		
	}

}
