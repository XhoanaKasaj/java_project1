package Entities;

import java.util.Date;

public class BaseEntities {

    private long id;
    private Date createdAt;
    private String createdBy;

    public BaseEntities(long id, Date createdAt, String createdBy) {
        this.id = id;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
