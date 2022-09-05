package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserDao {

	public List<User> getUserDetail(){
		List<User> list = new ArrayList<User>();
		list.add(new User("123", "Amol Madhav Bavaskar", "Amol@gmail.com"));
		list.add(new User("124", "Tejas Tukaram Jawalkar", "Tejas@gmail.com"));
		list.add(new User("126", "Amit Sunil More", "Amit@gmail.com"));
		list.add(new User("127", "Anjali Kulkarni", "Anjali@gmail.com"));
		list.add(new User("129", "Ramji Pandey", "Ramji@gmail.com"));
		list.add(new User("130", "Ashish Shukla", "Ashish@gmail.com"));
		list.add(new User("131", "Subhasish Das", "Subhasish@gmail.com"));
		
		return list;
	}
	
	
}
