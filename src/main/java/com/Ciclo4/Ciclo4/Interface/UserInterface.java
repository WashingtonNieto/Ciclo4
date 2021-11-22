package com.Ciclo4.Ciclo4.Interface;

import com.Ciclo4.Ciclo4.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserInterface extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}


