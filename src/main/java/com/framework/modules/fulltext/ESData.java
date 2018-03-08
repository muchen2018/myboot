package com.framework.modules.fulltext;

import com.framework.modules.fulltext.attachment.Attachment;

public class ESData {
	
	private String id;
	
	private String url;
	
	private String name;
	
	private String userId;
	
	private String path;
	
	private Attachment attachment;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Attachment getAttachment() {
		return attachment;
	}
	
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
}
