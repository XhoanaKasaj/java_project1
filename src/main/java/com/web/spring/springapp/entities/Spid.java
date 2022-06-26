package com.web.spring.springapp.entities;

import com.web.spring.springapp.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "spid")
public class Spid extends BaseEntity {


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userID;
    private String createdBy;
    @Enumerated(EnumType.STRING)
    private  SpidStatus spidStatus;
    @Enumerated(EnumType.STRING)
    private Type type;



}
