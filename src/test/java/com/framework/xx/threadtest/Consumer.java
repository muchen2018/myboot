package com.framework.xx.threadtest;

public class Consumer implements Runnable{
	
	private Model model;
	
	public Consumer(Model model) {
		this.model=model;
	}
	
	@Override
	public void run() {
		try {
			cons(model);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void  cons(Model model) throws InterruptedException {
		
		while(true) {
			
			Thread.sleep(1000);
			
			if(model.currentCount>0) {
				model.currentCount--;
				System.out.println("消费者消费:"+model.currentCount);
				model.notifyAll();
			}else {
				System.out.println("消费者等待:"+model.currentCount);
				try {
					model.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		}
	}
}
