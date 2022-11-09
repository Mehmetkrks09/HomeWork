package com.Akgul.FlowerShop.DataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Akgul.FlowerShop.Entitiy.Flower;


public interface FlowersRepo  extends JpaRepository<Flower, Integer>{

	Flower findById(int id);
	List<Flower> getByUserId(int id);
}
