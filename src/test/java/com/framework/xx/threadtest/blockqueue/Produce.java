package com.framework.xx.threadtest.blockqueue;

public class Produce implements Runnable{
	
	@Override
	public void run() {
		
		if(Storage.MAX_SIZE==Storage.list.size()) {
			System.out.println("队列已满");
		}
		
		try {
			Storage.list.put(new Object());
			
			System.out.println("size:"+Storage.list.size());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
