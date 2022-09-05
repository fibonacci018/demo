package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RestApiTestController {

	@GetMapping(value = "/name")
	public String greeting(@RequestParam (name = "name") String name) {
		return "Hello " + name;
	}
	@Autowired
	UserDao userDao;
	
	@GetMapping(value = "/user")
	public List<User> getAllUser(){
		
		return userDao.getUserDetail();
	}
}
