package com.example.springwebservice.service;

import com.example.springwebservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> userList;

    public UserService(){
        this.userList=new ArrayList<>();
        this.userList.add(new User(20,"jhon",30));
        this.userList.add(new User(10,"Mini",20));
        this.userList.add(new User(40,"Kila",300));
    }

    public List<User> getAllUsers() {
        return this.userList;
    }

    public User getUser(int id) {
        for (User user:this.userList){
            if(id==user.getId()){
                return user;
            }
        }
        return  null;
    }

    public User createUser(User user) {
        this.userList.add(user);
        return user;
    }

    public User updateUser(int id,User user) {
        for(User updateUser:this.userList){
            if(id==updateUser.getId()){
                updateUser.setName(user.getName());
                updateUser.setAge(user.getAge());
                return  updateUser;
            }
        }
        return null;
    }

    public User deleteUser(int id) {
        for(User user:this.userList){
            if (id == user.getId()) {
            userList.remove(id);
            return user;
            }
        }

        return null;
    }

} // Class end
