package com.Ciclo4.Ciclo4.Interface;

import com.Ciclo4.Ciclo4.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserInterface extends CrudRepository<User, Integer> {
}


