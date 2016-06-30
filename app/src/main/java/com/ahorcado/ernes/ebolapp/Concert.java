package com.ahorcado.ernes.ebolapp;

/**
 * Created by ernes on 6/29/2016.
 */
public class Concert {

    private String title;
    private String imageLink;
    private String link;

    public Concert(String title, String imageLink, String link) {
        this.title = title;
        this.imageLink = imageLink;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
