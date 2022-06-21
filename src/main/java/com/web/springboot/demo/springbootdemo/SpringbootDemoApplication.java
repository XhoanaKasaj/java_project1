package com.web.springboot.demo.springbootdemo;

import com.web.springboot.demo.entities.Spid;
import com.web.springboot.demo.entities.SpidStatus;
import com.web.springboot.demo.service.mainService;
import com.web.springboot.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication(scanBasePackageClasses = {mainService.class})
public class SpringbootDemoApplication implements CommandLineRunner {


	@Autowired
	public mainService userService;


	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		//create user
		User savedUser =
				mainService.createUser(new User(1,new Date(),"xkasaj","Xhoana","Kasaj","xkasaj"));

		User savedUser1 =
				mainService.createUser(new User(1, new Date(), "ikasaj","Ina","Kasaj","ikasaj"));


		//create spid
		Spid savedSpid = mainService.createSpid(new Spid(1,new Date(),"xkasaj",savedUser, "HELLO", SpidStatus.PENDING));
		Spid savedSpid1 = mainService.createSpid(new Spid(1,new Date(),"ikasaj",savedUser, "HELLO",SpidStatus.PENDING));

		Spid editStatus = mainService.editSpidStatus(new Spid(1,new Date(),"xkasaj",savedUser, "desc", SpidStatus.PENDING), SpidStatus.APPROVED);
		System.out.println("Spid status changed to : " + editStatus.getSpidStatus());

		Spid spid = new Spid(1,new Date(),"xkasaj",savedUser,"desc", SpidStatus.PENDING);
		Spid searchSpid = mainService.seachForSpidByUsername(spid, "xkasaj");
		System.out.println(searchSpid.getUser().getUsername() + " connected to " + "xhoana");


		//list of all SPIDS
		System.out.println("List of all SPIDS:\n" +savedUser.getName()+" " + savedSpid.getDescription()+" "+savedSpid.getSpidStatus());

		System.out.println(savedUser1.getName()+" " + savedSpid1.getDescription()+" "+savedSpid1.getSpidStatus());

	}
}
