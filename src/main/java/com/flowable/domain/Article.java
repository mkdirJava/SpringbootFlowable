package com.flowable.domain;

public class Article {

    private String id;
    private boolean status;
    private String url;
    private String author;
    
    public Article(String id, String author, String url) {
    	this.id= id;
    	this.author= author;
    	this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    

}