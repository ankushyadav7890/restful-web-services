package com.ankush.rest.webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ankush.rest.webservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
