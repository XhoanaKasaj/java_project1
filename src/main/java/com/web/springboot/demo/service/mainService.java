package com.web.springboot.demo.service;

import com.web.springboot.demo.entities.Spid;
import com.web.springboot.demo.entities.SpidStatus;
import com.web.springboot.demo.entities.User;
import org.springframework.stereotype.Service;

@Service


public class mainService {

    public static User createUser(User user){
        User savedUser= new User(
                user.getId(),
                user.getCreatedAt(),
                user.getCreatedBy(),
                user.getName(),
                user.getSurname(),
                user.getUsername()
        );

        return savedUser;
    }

    public void editUser(User user,String name,String surname,String username){
        user.setName(name);
        user.setSurname(surname);
        user.setUsername(username);
    }

    public static Spid createSpid(Spid spid){
        Spid savedSpid=new Spid(
                spid.getId(),
                spid.getCreatedAt(),
                spid.getCreatedBy(),
                spid.getUser(),
                spid.getDescription(),
                spid.getSpidStatus()
        );
        return  savedSpid;
    }

    public void editSpid(Spid spid, User user, String description, SpidStatus spidStatus){
        spid.setUser(user);
        spid.setDescription(description);
        spid.setSpidStatus(spidStatus);
    }

    public static Spid editSpidStatus(Spid spid, SpidStatus spidStatus){
        Spid changedSpid = new Spid(
                spid.getId(),
                spid.getCreatedAt(),
                spid.getCreatedBy(),
                spid.getUser(),
                spid.getDescription(),
                spidStatus
        );

        return changedSpid;
    }

    public static Spid seachForSpidByUsername(Spid spid, String username) throws Exception {
        if(spid.getUser().getUsername().equals(username)){
            return spid;
        }else {
            throw new Exception("No user connected to this SPID !");
        }

    }




}
