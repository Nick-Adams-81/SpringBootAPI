package com.example.newspringbootapi.controllers;

import com.example.newspringbootapi.models.Posts;
import com.example.newspringbootapi.servicies.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PostsController {

    @Autowired
    private PostsService postService;

    @GetMapping("/get-posts")
    @ResponseBody
    public List<Posts> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/get-post/{id}")
    @ResponseBody
    public Optional<Posts> getOnePost(@PathVariable long id) {
        return postService.getOnePost(id);
    }

    @GetMapping("get-post-by-title/{title}")
    @ResponseBody
    public Posts getOnePostByTitle(@PathVariable String title) {
        return postService.findByTitle(title);
    }

    @PostMapping("/save-post")
    @ResponseBody
    public String savePost(@RequestBody Posts post) {
        postService.savePost(post);
        return "New Post added";
    }

    @DeleteMapping("/delete-post/{id}")
    @ResponseBody
    public String deletePost(@PathVariable Posts id) {
        postService.deletePost(id);
        return "Post with id: " + id.getId() + " has been deleted";
    }
}
