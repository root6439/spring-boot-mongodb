package com.root6439.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.root6439.springmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}