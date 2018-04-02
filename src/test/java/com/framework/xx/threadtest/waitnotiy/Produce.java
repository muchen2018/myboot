package com.framework.xx.threadtest.waitnotiy;

public class Produce extends Thread{
	
	
	private Storage s;
	
	public Produce(Storage s) {
		this.s=s;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.pop();
		}
		
	}

}
