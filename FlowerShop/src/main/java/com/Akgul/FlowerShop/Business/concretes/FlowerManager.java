package com.Akgul.FlowerShop.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Akgul.FlowerShop.Business.abstracts.FlowerService;
import com.Akgul.FlowerShop.DataAccess.FlowersRepo;
import com.Akgul.FlowerShop.Entitiy.Flower;

@Service
public class FlowerManager implements FlowerService {

	private FlowersRepo repository;
	
	@Autowired
	public FlowerManager(FlowersRepo repository) {
		super();
		this.repository = repository;
	}

	@Override
	public void add(Flower flower) {
		
	repository.save(flower);
	}

	@Override
	public void delete(int id) {
		Flower flower= new Flower();
		flower.setId(id);
		repository.delete(flower);
		
	}

	@Override
	public void update(Flower flower) {
		Flower tempFlower = new Flower();
		tempFlower.setId(flower.getId());
		tempFlower.setName(flower.getName());
		tempFlower.setUnıtInStock(flower.getUnıtInStock());
		tempFlower.setUserId(flower.getUserId());
		repository.save(tempFlower);
		
	}

	@Override
	public List<Flower> getAll() {

		return repository.findAll();
	}

	@Override
	public Flower findById(int id) {

		return repository.findById(id);
	}

	@Override
	public List<Flower> getByUserId(int id) {

		return repository.getByUserId(id);
	}

}
