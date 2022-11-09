package com.Akgul.FlowerShop.Business.abstracts;

import java.util.List;

import com.Akgul.FlowerShop.Entitiy.Flower;

public interface FlowerService {

	void add(Flower flower);
	void delete(int id);
	void update(Flower flower);
	List<Flower> getAll();
	Flower findById(int id);
	List<Flower> getByUserId(int id);
}
