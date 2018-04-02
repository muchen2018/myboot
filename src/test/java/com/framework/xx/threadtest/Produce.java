package com.framework.xx.threadtest;

public class Produce implements Runnable{
	
	private Model model;
	
	public Produce(Model model) {
		this.model=model;
	}

	@Override
	public void run() {
		try {
			pop(model);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void  pop(Model model) throws InterruptedException {
		while(true) {
			
			Thread.sleep(1000);
			
			if(model.currentCount<model.totalCount) {
				model.currentCount++;
				System.out.println("生产者生产:"+model.currentCount);
				model.notifyAll();
			}else {
				System.out.println("生产者等待:"+model.currentCount);
				try {
					model.wait();
				} catch (InterruptedException e) {
				}
			}
		}
	}

}
