package com.example.cache.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.cache.model.Users;
import com.example.cache.repository.UsersRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    public void load() {
        List<Users> usersList = getList();
        usersRepository.save(usersList);
    }

    public List<Users> getList() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users("Raj", "IT",154122L));
        usersList.add(new Users("XYZ", "Service",1302215L));
        usersList.add(new Users("Am", "Service",1302215L));
        usersList.add(new Users("Thor", "Lightning",13055215L));
        return usersList;
    }
}
