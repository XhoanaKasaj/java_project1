package Entities;

public class Spid {

    private User user;
    private String description;

    private SpidStatus spidStatus=SpidStatus.PENDING;

    public Spid(){

    }

    public Spid(User user, String description, SpidStatus spidStatus) {
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
