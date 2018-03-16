package com.framework.modules.mq;

import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.framework.common.fulltext.ElasticSearchHandler;
import com.framework.common.fulltext.attachment.Attachment;
import com.framework.common.fulltext.attachment.AttachmentProcessor;
import com.framework.modules.fulltext.entity.DiskDoc;

@Component
public class Receiver {
	
	@RabbitListener(queues = "hello.queue1")
	public void processMessage1(String msg) {
		System.out.println(Thread.currentThread().getName() + "--- 接受到------>" + msg);
		try {
			String id=UUID.randomUUID().toString();
			DiskDoc template=new DiskDoc();
			
			template.setId(id);
			template.setName(msg);
			template.setUrl("group1/M00/xxx/xxx2");
			template.setPath("我的文档/我的测试文档");
			
			if("pdf".equals(msg)) {
				File f=new File("C:\\Users\\26371\\Desktop\\Spring Cloud微服务实战_PDF电子书下载 高清 带索引书签目录_翟永超(著)  @www.java1234.com.pdf");
				FileInputStream in=new FileInputStream(f);
				Attachment att = AttachmentProcessor.parse(in);
				template.setAttachment(att);
			}
			
			ElasticSearchHandler.addDoc(ElasticSearchHandler.DEFAULT_INDEX,ElasticSearchHandler.DEFAULT_TYPE,template);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "-----完成处理------->" + msg);
	}

}
