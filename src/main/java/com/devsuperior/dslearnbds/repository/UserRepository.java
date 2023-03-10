package com.devsuperior.dslearnbds.repository;

import com.devsuperior.dslearnbds.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String username);
}
