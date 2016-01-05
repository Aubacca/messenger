package com.pro.messenger.model;

import java.util.Date;

/**
 * Created on 05.01.2016.
 */
public class Comment {

    private long id;
    private String comment;
    private Date created;
    private String author;

    public Comment(long id, String comment, String author) {
        setId(id);
        setComment(comment);
        setAuthor(author);
        setCreated(new Date());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", created=" + created +
                ", author='" + author + '\'' +
                '}';
    }
}
