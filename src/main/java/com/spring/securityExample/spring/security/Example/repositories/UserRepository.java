package com.spring.securityExample.spring.security.Example.repositories;

import com.spring.securityExample.spring.security.Example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
