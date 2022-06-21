package Service;

import Entities.Spid;
import Entities.SpidStatus;
import Entities.User;

public class MainService {

    public User createUser(User user){
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

    public  Spid createSpid(Spid spid){
        Spid savedSpid=new Spid(
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

    public Spid editSpidStatus(Spid spid, SpidStatus spidStatus){
        Spid changedSpid = new Spid(
                spid.getUser(),
                spid.getDescription(),
                spidStatus
        );

        return changedSpid;
    }

    public Spid seachForSpidByUsername(Spid spid, String username) throws Exception {
        if(spid.getUser().getUsername().equals(username)){
            return spid;
        }else {
            throw new Exception("No user connected to this SPID !");
        }

    }




}
