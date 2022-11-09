package com.Akgul.FlowerShop.Business.abstracts;

import java.util.List;

import com.Akgul.FlowerShop.Entitiy.User;

public interface UserService {
	
	void add(User user);
	void delete(int id);
	void update(User user);
	List<User> getAll();
	User findById(int id);
}

