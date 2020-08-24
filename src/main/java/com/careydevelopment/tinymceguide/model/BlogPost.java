package com.careydevelopment.tinymceguide.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BlogPost {

	private String id;	
	private String title;
	private String body;
	
	
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getBody() {
        return body;
    }


    public void setBody(String body) {
        this.body = body;
    }


    public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
