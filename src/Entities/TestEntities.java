package Entities;

import Service.MainService;

import java.util.Date;

public class TestEntities {

    public static void main(String[] args) throws Exception {

        MainService mainService = new MainService();


        //create user
        User savedUser =
                mainService.createUser(new User(1,new Date(),"xkasaj","Xhoana","Kasaj","xkasaj"));

        User savedUser1 =
                mainService.createUser(new User(1, new Date(), "ikasaj","Ina","Kasaj","ikasaj"));


        //create spid
        Spid savedSpid = mainService.createSpid(new Spid(savedUser, "HELLO",SpidStatus.PENDING));
        Spid savedSpid1 = mainService.createSpid(new Spid(savedUser, "HELLO",SpidStatus.PENDING));

        Spid editStatus = mainService.editSpidStatus(new Spid(savedUser, "desc", SpidStatus.PENDING), SpidStatus.APPROVED);
        System.out.println("Spid status changed to : " + editStatus.getSpidStatus());

        Spid spid = new Spid(savedUser,"desc", SpidStatus.PENDING);
        Spid searchSpid = mainService.seachForSpidByUsername(spid, "xkasaj");
        System.out.println(searchSpid.getUser().getUsername() + " connected to " + "xhoana");


        //list of all SPIDS
        System.out.println("List of all SPIDS:\n" +savedUser.getName()+" " + savedSpid.getDescription()+" "+savedSpid.getSpidStatus());

        System.out.println(savedUser1.getName()+" " + savedSpid1.getDescription()+" "+savedSpid1.getSpidStatus());

}}
