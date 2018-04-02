package com.framework.xx.threadtest;

public class Produce implements Runnable{
	

	@Override
	public void run() {
		synchronized (this) {
			if(Model.currentCount<Model.totalCount) {
				Model.currentCount++;
				System.out.println("生产者生产:"+Model.currentCount);
				notifyAll();
			}else {
				System.out.println("生产者等待:"+Model.currentCount);
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
