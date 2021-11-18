package com.Ciclo4.Ciclo4.repository;


import com.Ciclo4.Ciclo4.Interface.UserInterface;
import com.Ciclo4.Ciclo4.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserRepository {


    @Autowired
    private UserInterface crud;
    public List<User> getAll(){
        return (List<User>) crud.findAll();
    }
    public Optional<User> getUser(int id){
        return crud.findById(id);
    }
    public User save(User User){
        return crud.save(User);
    }
    public void delete(User User){
        crud.delete(User);
    }
}
