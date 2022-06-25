package com.web.spring.springapp.entities;

import com.web.spring.springapp.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntity {

    private String name;
    private String surname;
    private String cardNo;
    private String username;
    private String password;
    private String email;


    public User( String name, String surname, String cardNo, String username, String password, String email, LocalDateTime createdAt, String createdBy) {
        super(createdAt, createdBy);
        this.name = name;
        this.surname = surname;
        this.cardNo = cardNo;
        this.username = username;
        this.password = password;
        this.email = email;
    }




}
