package com.framework;

import java.util.concurrent.Executor;

import org.apache.tika.exception.TikaException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xml.sax.SAXException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadPoolTest {
	
	private Executor executor;

	@Test
	public void test() throws SAXException, TikaException, Exception {
		
		int n = 20;
		for (int i = 0; i < n; i++) {
			
			executor.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("----begin----->"+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("----end----->"+Thread.currentThread().getName());
				}
			});
		}
	}
	
}
