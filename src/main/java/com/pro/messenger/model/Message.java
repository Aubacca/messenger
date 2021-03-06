package com.pro.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.*;

/**
 * Created on 29.12.2015.
 */
@XmlRootElement
public class Message {

    private long id;
    private String message;
    private Date created;
    private String author;
    private List<String> likes;

    public Message() {
    }

    public Message(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.author = author;
        setCreated(new Date());
        setLikes();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public List<String> getLikes () {
        return likes;
    }

    public void setLikes() {
        likes = new ArrayList<>();
        likes.add("Tom");
        likes.add("Jerry");
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        return id == message.id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", created=" + created +
                ", author='" + author + '\'' +
                ", likes='" + getLikes() + '\'' +
                '}';
    }
}
