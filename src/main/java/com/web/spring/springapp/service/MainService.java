package com.web.spring.springapp.service;


import com.web.spring.springapp.entities.Spid;
import com.web.spring.springapp.entities.User;
import com.web.spring.springapp.repository.SpidRepository;
import com.web.spring.springapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MainService {
    @Autowired
    UserRepository  userRepository;
    @Autowired
    SpidRepository spidRepository;


    public User createUser(User user){
        return userRepository.save(user);
    }


    public Spid createSpid(Spid spid){
        return spidRepository.save(spid);
    }

    public void editUser(User user,Long id){
        Optional<User> findUser = userRepository.findById(id);

        if(findUser.isPresent()){
            findUser.get().setName(user.getName());
            findUser.get().setSurname(user.getSurname());
            findUser.get().setCardNo(user.getCardNo());
            findUser.get().setUsername(user.getUsername());
            findUser.get().setPassword(user.getPassword());
            findUser.get().setEmail(user.getEmail());

        }

        userRepository.save(findUser.get());


    }

    public void editSpid(Spid spid, Long id){
        Optional<Spid> findSpid = spidRepository.findById(id);
    }

    public void deleteUSer(long id){
        userRepository.deleteById(id);

    }

    public void deleteSpid(long id){
        spidRepository.deleteById(id);
    }


}
