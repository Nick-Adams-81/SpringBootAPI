package com.example.newspringbootapi.servicies;

import com.example.newspringbootapi.models.Posts;

import java.util.List;
import java.util.Optional;

public interface PostsService {

    void savePost(Posts post);

    List<Posts> getAllPosts();

    void deletePost(Posts id);

    Optional<Posts> getOnePost(long id);
}
