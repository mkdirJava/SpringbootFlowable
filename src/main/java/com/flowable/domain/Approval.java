package com.flowable.domain;


public class Approval {

    private String id;
    private String author;
    private String url;
    private boolean status;

    public Approval() {
    }

    public Approval(String author, String url) {
        this.author = author;
        this.url = url;
    }

    public Approval(String id, String author, String url) {
        this.id = id;
        this.author = author;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public boolean isStatus() {
		return status;
	}
    public void setStatus(boolean status) {
		this.status = status;
	}

    @Override
    public String toString() {
        return ("[" + this.author + " " + this.url + "]");
    }

}