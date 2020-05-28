package com.framework.xx.threadtest;


public class ThreeThreadPrint implements Runnable{
    
    private static int currentNO;
    
    private int currentThread;
    
    private String name;
    
    private final static Object Lock = new Object();
    
    public ThreeThreadPrint(int currentThread,String name) {
        this.currentThread = currentThread;
        this.name = name;
    }

    public static void main(String[] args) {
        
        ThreeThreadPrint t0 = new ThreeThreadPrint(0, "A");
        new Thread(t0).start();
        
        ThreeThreadPrint t1 = new ThreeThreadPrint(1, "B");
        new Thread(t1).start();
        
        ThreeThreadPrint t2 = new ThreeThreadPrint(2, "C");
        new Thread(t2).start();
    }

    @Override
    public void run() {
        synchronized(Lock) {
            while(true) {
                while(currentNO % 3 != currentThread) {
                    try {
                        Lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                
                System.out.println("当前线程"+currentThread +" 打印"+name);
                currentNO ++;
                Lock.notifyAll();
            }
        }
    }

}
