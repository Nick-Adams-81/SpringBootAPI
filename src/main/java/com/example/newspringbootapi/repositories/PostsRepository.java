package com.example.newspringbootapi.repositories;

import com.example.newspringbootapi.models.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
