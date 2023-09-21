package com.example.newspringbootapi.servicies;

import com.example.newspringbootapi.models.Posts;
import com.example.newspringbootapi.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PosstsServiceAPI implements PostsService{

    @Autowired
    private PostsRepository postDao;

    @Override
    public void savePost(Posts post) {
        postDao.save(post);
    }

    @Override
    public List<Posts> getAllPosts() {
        return postDao.findAll();
    }

    @Override
    public void deletePost(Posts id) {
        postDao.delete(id);
    }

    @Override
    public Optional<Posts> getOnePost(long id) {
        return postDao.findById(id);
    }
}
