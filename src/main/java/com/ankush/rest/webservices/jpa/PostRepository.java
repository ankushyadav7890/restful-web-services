package com.ankush.rest.webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankush.rest.webservices.user.Post;


public interface PostRepository extends JpaRepository<Post, Integer> {

}
