package com.framework.modules.fulltext.attachment;

public class Attachment {

	private String name;
	
	private String title;
	
	private String content;
	
	private String author;
	
	private String lastAuthor;
	
	private String contentType;
	
	private long contentLength;
	
	private String keywords;
	
	private String creationDate;
	
	private String lastModifiedDate;
	
	private AttachmentImage image;
	
	private AttachmentOffice office;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLastAuthor() {
		return lastAuthor;
	}

	public void setLastAuthor(String lastAuthor) {
		this.lastAuthor = lastAuthor;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getContentLength() {
		return contentLength;
	}

	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public AttachmentImage getImage() {
		return image;
	}

	public void setImage(AttachmentImage image) {
		this.image = image;
	}

	public AttachmentOffice getOffice() {
		return office;
	}

	public void setOffice(AttachmentOffice office) {
		this.office = office;
	}
}
