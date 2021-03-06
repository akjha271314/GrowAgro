package com.aashutosh.GrowAgroLogIn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aashutosh.GrowAgroLogIn.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
