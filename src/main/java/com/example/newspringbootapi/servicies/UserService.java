package com.example.newspringbootapi.servicies;

import com.example.newspringbootapi.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    void deleteUser(User id);

    Optional<User> getOneUser(long id);

    List<User> findOneUserByName(String name);

    User findByName(String name);

}
