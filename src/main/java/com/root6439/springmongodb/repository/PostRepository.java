package com.root6439.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.root6439.springmongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
