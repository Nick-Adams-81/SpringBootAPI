package com.example.newspringbootapi.controllers;


import com.example.newspringbootapi.models.User;
import com.example.newspringbootapi.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-users")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get-user/{id}")
    @ResponseBody
    public Optional<User> getOneUser(@PathVariable long id) {
        return userService.getOneUser(id);
    }

    @PostMapping("/save-user")
    @ResponseBody
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "New User Added!";
    }

    @DeleteMapping("/delete-user/{id}")
    @ResponseBody
    public String deleteUser(@PathVariable User id) {
        userService.deleteUser(id);
        return "User Deleted";
    }
}
