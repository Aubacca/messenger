package com.pro.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created on 29.12.2015.
 */
@XmlRootElement
public class Profile {
    private long id;
    private String name;
    private String firstName;
    private String lastName;
    private Date created;

    public Profile() {
    }

    public Profile(long id, String name, String firstName, String lastName) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        setCreated(new Date());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", created=" + created +
                '}';
    }
}
