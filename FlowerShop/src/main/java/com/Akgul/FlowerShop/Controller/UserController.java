package com.Akgul.FlowerShop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Akgul.FlowerShop.Business.abstracts.UserService;
import com.Akgul.FlowerShop.Entitiy.User;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService service;

	@Autowired
	public UserController(UserService service) {
		super();
		this.service = service;
	}
@PostMapping("/add")
public void add(User user) {
	service.add(user);
	
}

@DeleteMapping("/delete")
public void delete(int id) {
	service.delete(id);
}

@PutMapping("/update")
public void update(User user) {
	service.update(user);
}

@GetMapping("/getAll")
public List<User> getAll() {
	return service.getAll();
}

@GetMapping("/findById")
public User fingById(int id) {
	return service.findById(id);
}

	

}
