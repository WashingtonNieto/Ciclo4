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
            if (existeEmail(user.getEmail()) == false){
                return metodosCrud.save(user);
            }else {
                return user;
            }
        } else {
            return user;
        }

    }

    public boolean existeEmail(String email){
        return metodosCrud.existeEmail(email);
    }
    public User autenticarUsuario(String email, String password) {
        Optional<User> usuario = metodosCrud.autenticarUsuario(email, password);

        if (usuario.isEmpty()) {
//            return new User(email, password, "NO DEFINIDO");
            return usuario.get();

        } else {
            return usuario.get();
        }
    }
}
