package com.example.newspringbootapi.servicies;

import com.example.newspringbootapi.models.Posts;

import java.util.List;
import java.util.Optional;

public class PosstsServiceAPI implements PostsService{
    @Override
    public void savePost(Posts post) {

    }

    @Override
    public List<Posts> getAllPosts() {
        return null;
    }

    @Override
    public void deletePost(Posts id) {

    }

    @Override
    public Optional<Posts> getOnePost(long id) {
        return Optional.empty();
    }
}
