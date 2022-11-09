package com.Akgul.FlowerShop.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Akgul.FlowerShop.Business.abstracts.UserService;
import com.Akgul.FlowerShop.DataAccess.UsersRepo;
import com.Akgul.FlowerShop.Entitiy.User;

@Service
public class UserManager implements UserService {

	private UsersRepo repository;
	
	@Autowired
	public UserManager(UsersRepo repository) {
		super();
		this.repository = repository;
	}

	@Override
	public void add(User user) {
		repository.save(user);
		
	}

	@Override
	public void delete(int id) {
		User user= new User();
		user.setId(id);
		repository.delete(user);
		
	}

	@Override
	public void update(User user) {
		User tempUser = new User();
		tempUser.setId(user.getId());
		tempUser.setFirstName(user.getFirstName());
		tempUser.setLastName(user.getLastName());
		tempUser.setPhoneNumber(user.getPhoneNumber());
		tempUser.setAddress(user.getAddress());
		repository.save(tempUser);

		
	}

	@Override
	public List<User> getAll() {

		return repository.findAll();
	}

	@Override
	public User findById(int id) {

		return repository.findById(id);
	}

}
