package com.example.newspringbootapi.controllers;

import com.example.newspringbootapi.servicies.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PostsController {

    @Autowired
    private PostsService postService;
}
