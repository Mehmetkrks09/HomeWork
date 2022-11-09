package com.Akgul.FlowerShop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Akgul.FlowerShop.Business.abstracts.FlowerService;
import com.Akgul.FlowerShop.Entitiy.Flower;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

	private FlowerService service;

	@Autowired
	public FlowerController(FlowerService service) {
		super();
		this.service = service;
	}
	

@PostMapping("/add")
public void add(Flower flower) {
service.add(flower);

}

@DeleteMapping("/delete")
public void delete(int id) {
service.delete(id);
}

@PutMapping("/update")
public void update(Flower flower) {
service.update(flower);
}

@GetMapping("/getAll")
public List<Flower> getAll() {
	
 return service.getAll();
}

@GetMapping("/findById")
public Flower fingById(int id) {
return service.findById(id);
}
@GetMapping("/getByUserId")
public List<Flower> getByUserId(int id) {

	return service.getByUserId(id);
}
}