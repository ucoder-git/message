package com.unify21.message.repository;

import com.unify21.message.MessageApplication;
import com.unify21.message.MessageApplicationTests;
import com.unify21.message.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends MessageApplicationTests {

    // Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        // String sql = insert into user (%s, %s, %d) value (account, email, age);
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-4444-5555");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser1");

        User newUser = userRepository.save(user);
        System.out.println("newUser : "+newUser);
    }
    public void read(){

    }

    public void update() {

    }

    public void delete() {

    }
}
