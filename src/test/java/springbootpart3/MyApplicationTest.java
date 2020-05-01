package springbootpart3;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import service.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = MyApplication.class)


public class MyApplicationTest {


    UserServiceImpl userServiceIml=new UserServiceImpl();

    @Test
    void addUser(){
        assertEquals("Gift Entered",userServiceIml.addUser(5,"Gift","Moshobane"));

    }
    @Test
    void removeUser(){
        userServiceIml.addUser(5,"Gift","Moshobane");
        assertEquals("Gift Removed",userServiceIml.removeUser(5));
    }
    @Test
    void getUser(){
        userServiceIml.addUser(5,"Gift","Moshobane");
        assertEquals("Hello Gift",userServiceIml.getUser(5));
    }

}