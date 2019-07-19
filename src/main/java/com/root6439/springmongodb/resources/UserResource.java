package com.root6439.springmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.root6439.springmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User user = new User("1", "Nicolas", "nicolas@gmail.com");
		User user2 = new User("2", "Nicoly", "nicoly@gmail.com");
		User user3 = new User("3", "Nathan", "nathan@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(user, user2, user3));
		
		return ResponseEntity.ok().body(list);
	}
	
}
