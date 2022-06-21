package com.web.springboot.demo.entities;

import java.util.Date;

public class Spid extends BaseEntities{
    private User user;
    private String description;
    private SpidStatus spidStatus=SpidStatus.PENDING;

    public Spid(long id, Date createdAt, String createdBy, User user, String description, SpidStatus spidStatus) {
        super(id, createdAt, createdBy);
        this.user = user;
        this.description = description;
        this.spidStatus = spidStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SpidStatus getSpidStatus() {
        return spidStatus;
    }

    public void setSpidStatus(SpidStatus spidStatus) {
        this.spidStatus = spidStatus;
    }
}
