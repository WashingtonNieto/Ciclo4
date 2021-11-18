package com.Ciclo4.Ciclo4.services;

import com.Ciclo4.Ciclo4.entity.User;
import com.Ciclo4.Ciclo4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository metodosCrud;

    public List<User> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<User> getUser(int UserId) {
        return metodosCrud.getUser(UserId);
    }

    public User save(User user) {
        if (user.getId()==null) {
            return metodosCrud.save(user);
        } else {
            Optional<User> e = metodosCrud.getUser(user.getId());
            if (e.isEmpty()) {
                return metodosCrud.save(user);
            } else {
                return user;
            }
        }
    }

}
