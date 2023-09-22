package com.example.newspringbootapi.controllers;

import com.example.newspringbootapi.models.Posts;
import com.example.newspringbootapi.servicies.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostsController {

    @Autowired
    private PostsService postService;

    @GetMapping("get-posts")
    @ResponseBody
    public List<Posts> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("save-post")
    @ResponseBody
    public String savePost(@RequestBody Posts post) {
        postService.savePost(post);
        return "New Post added";
    }
}
