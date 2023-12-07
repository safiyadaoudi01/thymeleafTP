package com.example.thymeleafTP.repositories;

import com.example.thymeleafTP.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {}
