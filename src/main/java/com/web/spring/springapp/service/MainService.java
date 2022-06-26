package com.web.spring.springapp.service;


import com.web.spring.springapp.entities.Spid;
import com.web.spring.springapp.entities.User;
import com.web.spring.springapp.repository.SpidRepository;
import com.web.spring.springapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainService {

    UserRepository  userRepository;
    SpidRepository spidRepository;

    MainService(SpidRepository spidRepository,UserRepository userRepository){
        this.userRepository=userRepository;
        this.spidRepository=spidRepository;
    }


    public User createUser(User user) throws Exception {
        Optional<User>  findIfPersonExists = userRepository.findByName(user.getName());
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


    public Object changeSpidStatus(Long id) {
        return null;
    }

    public Object retrieveAllSpids() {
        return null;
    }

    public List<Spid> SearchSpid(String createdBy){
        return spidRepository.searchSpid("xkasaj");
    };
}
