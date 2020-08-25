package com.careydevelopment.tinymceguide.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BlogPost {

	private String title;
	private String body;	

	public String getBody() {
		return body;
	}
	public String getTitle() {
		return title;
	}
	public void setBody(String body) {
		this.body = body;
	}
		public void setTitle(String title) {
		this.title = title;
	}
	
    public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
