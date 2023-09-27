package com.example.newspringbootapi.servicies;

import com.example.newspringbootapi.models.User;
import com.example.newspringbootapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceAPI implements UserService{

    @Autowired
    private UserRepository userDao;

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public void deleteUser(User id) {
        userDao.delete(id);
    }

    @Override
    public Optional<User> getOneUser(long id) {
        return userDao.findById(id);
    }

//    @Override
//    public List<User> findOneUserByName(String name) {
//        return null;
//    }

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }


}
