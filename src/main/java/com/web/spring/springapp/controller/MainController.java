package com.web.spring.springapp.controller;
import com.web.spring.springapp.entities.Spid;
import com.web.spring.springapp.entities.User;
import com.web.spring.springapp.service.MainService;
import org.jboss.jandex.Main;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value="/api")
public class MainController{
    MainService mainService;

    MainController(MainService mainService){
        this.mainService=mainService;
    }

    //create user
    @PostMapping("/create/user")
    public ResponseEntity<User> createUser(
            @RequestBody User user
    ) throws Exception {
        mainService.createUser(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    //create spid
    @PostMapping("/create/spid")
    public  ResponseEntity<Spid> createSpid(
            @RequestBody Spid spid
    ) throws Exception {
        mainService.createSpid(spid);
        return new ResponseEntity(spid, HttpStatus.OK);
    }

    //delete user
    @DeleteMapping("/delete/user/{id}")
    public ResponseEntity<String> deleteUSer(
            @PathVariable(name = "id") long id
    ) throws Exception {
        mainService.deleteUSer(id);
        return new ResponseEntity(" This User was deleted ", HttpStatus.OK);
    }

    //delete spid
    @DeleteMapping("/delete/spid/{id}")
    public ResponseEntity<String> deleteSpid(
            @PathVariable(name = "id") long id
    ) throws Exception {
        mainService.deleteSpid(id);
        return new ResponseEntity(" This Spid was deleted ", HttpStatus.OK);
    }

    //edit user
    @PutMapping("/edit/user")
    public ResponseEntity<User> editUser(
            @RequestBody User user,
            @RequestParam long id
    ) throws Exception {
        user.setId(id);
        return new ResponseEntity(mainService.createUser(user), HttpStatus.OK);
    }

    //change spid status
    @PutMapping("/changeSpidStatus/{id}")
    public ResponseEntity<Spid> changeSpidStatus(
            @PathVariable (name = "id")Long id
    ) throws Exception {
        return new ResponseEntity(mainService.changeSpidStatus(id),HttpStatus.OK);
    }

    //retrieve all spids
    @GetMapping("/getAllSpids")
    public ResponseEntity<List<Spid>> getAllSpids() throws Exception {
        return new ResponseEntity(mainService.retrieveAllSpids(), HttpStatus.OK);
    }

    @GetMapping("/searchSpid")
    public ResponseEntity<List<Spid>> searchSpid(
            @PathVariable(name = "createdBy") String createdBy
    )throws Exception{

        return new ResponseEntity(mainService.SearchSpid(createdBy),HttpStatus.OK);
    }


}
