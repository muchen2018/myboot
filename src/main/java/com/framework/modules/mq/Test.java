package com.framework.modules.mq;

public class Test {

	public static void main(String[] a) {
		new Thread(() -> {
			System.out.println(2);
		}).start();
	}

}
