package com.example.springboot_backend.Controller;

import com.example.springboot_backend.Model.User;
import com.example.springboot_backend.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//springboot and react both app are running at different port to no data will be shown
// to connect react and show data we have to provide CrossOrigin annotation
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/")
public class userController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("users")
    public List<User> getUsers()
    {
        return userRepo.findAll();
    }

    @PostMapping("users")
    public User addUser(User user)
    {
      // User user=new User("vaasu","prmr","vsdvprmr@gmail.com");
        userRepo.save(user);
        System.out.println(user);
        return user;
    }
}
