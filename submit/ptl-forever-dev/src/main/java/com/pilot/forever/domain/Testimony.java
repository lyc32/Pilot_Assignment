package com.pilot.forever.domain;

public class Testimony {

    private int id;//return but hide
    private String text;
    private String authorName;
    private String authorTitle;
    private String authorClient;
    private String createDate;//return but hide

    public Testimony() { }

    public Testimony(int id, String text, String authorName, String authorTitle, String authorClient, String createDate) {
        this.id = id;
        this.text = text;
        this.authorName = authorName;
        this.authorTitle = authorTitle;
        this.authorClient = authorClient;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorTitle() {
        return authorTitle;
    }

    public void setAuthorTitle(String authorTitle) {
        this.authorTitle = authorTitle;
    }

    public String getAuthorClient() {
        return authorClient;
    }

    public void setAuthorClient(String authorClient) {
        this.authorClient = authorClient;
    }
}
