package com.example.springwebservice.controller;

import com.example.springwebservice.model.User;
import com.example.springwebservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getAllUsers() {
        List<User> userList=this.userService.getAllUsers();

        return userList;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        User user=this.userService.getUser(id);
        return user;
    }

    @PostMapping()
    public User createUser(@RequestBody User user) {
        User creatUser=this.userService.createUser(user);
        return creatUser;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User user) {
       User updatedUser=this.userService.updateUser(id,user);
        return updatedUser;
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable int id) {
        User deletUser =this.userService.deleteUser(id);
        return deletUser;
    }
} // Class end
