package com.web.spring.springapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDateTime createdAt;
    private String createdBy;

    BaseEntity(LocalDateTime createdAt, String createdBy){
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }
}
