package com.Fimatic.fimatic.repository;

import com.Fimatic.fimatic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByUsernameAndPassword(String username, String password);
}
