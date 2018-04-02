package com.framework.xx.threadtest;

public class Consumer implements Runnable{
	
	@Override
	public void run() {
		synchronized (this) {
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if(Model.currentCount>0) {
				
				Model.currentCount--;
				System.out.println("消费者消费:"+Model.currentCount);
				notifyAll();
			}else {
				System.out.println("消费者等待:"+Model.currentCount);
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
	}
}
