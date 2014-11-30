package org.wbd.model;

import java.util.Calendar;
import java.util.Date;

public class Comment {
	private int postId;
	private String sender;
	private String email;
	private Calendar date;
	private String content;
	
	public Comment() {
		
	}
	
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getSender() {
		return sender;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDate() {
		return date.getTime();
	}
	
	public void setDate(Date date) {
		this.date.setTime(date);
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
