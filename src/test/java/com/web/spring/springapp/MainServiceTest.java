package com.web.spring.springapp;

import com.web.spring.springapp.SpringAppApplication;
import com.web.spring.springapp.entities.Spid;
import com.web.spring.springapp.entities.SpidStatus;
import com.web.spring.springapp.entities.Type;
import com.web.spring.springapp.entities.User;
import com.web.spring.springapp.service.MainService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest(classes = {SpringAppApplication.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainServiceTest {

    @Autowired
    MainService mainService;



    @Test
    public void userTest() {
        System.out.println(mainService.createUser(new User("hahs","jhds","123","xkasaj","5678","xkasaj@gmail.com", LocalDateTime.now(),"xkasaj")));
    }

    @Test
    public void spidTest(){

        System.out.println(mainService.createSpid
                (new Spid(new User(),"sara",SpidStatus.PENDING,Type.LEVEL_1)));
    }

    @Test
    public void editSpidTest(){
        Spid firstspid=new Spid(new User(),"ikasaj",SpidStatus.READY_FOR_REVIEW, Type.LEVEL_1);
        mainService.editSpid(firstspid,1L);
        firstspid.setSpidStatus(SpidStatus.PENDING);

    }


    @Test
    public void editUserTest(){
        User firstuser=new User("Era","Mecaj","123","emecaj","5678","xkasaj@gmail.com", LocalDateTime.now(),"xkasaj");
        mainService.editUser(firstuser,24L);

    }

    @Test
    public void deleteUserTest(){
//        User firstuser=new User("Mela","Mecaj","2486","mmecaj","3456","smecaj@gmail.com",LocalDateTime.now(),"mmecaj");
        mainService.deleteUSer(7L);
    }

    @Test
    public void deleteSpidTest(){
//        Spid firstspid=new Spid(new User(),"sara",SpidStatus.PENDING, Type.LEVEL_1);
        mainService.deleteSpid(12L);
    }

}