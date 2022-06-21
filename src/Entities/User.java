package Entities;

import java.util.Date;

public class User extends BaseEntities {

    private String name;
    private String surname;
    private String username;


    public User(long id, Date createdAt, String createdBy, String name, String surname, String username){
        super(id, createdAt, createdBy);
        this.name=name;
        this.surname=surname;
        this.username=username;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
