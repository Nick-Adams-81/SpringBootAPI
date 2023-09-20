package com.example.newspringbootapi.repositories;

import com.example.newspringbootapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
