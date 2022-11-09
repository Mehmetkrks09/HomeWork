package com.Akgul.FlowerShop.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Akgul.FlowerShop.Entitiy.User;

public interface UsersRepo  extends JpaRepository<User,Integer>{

	User findById(int id);
}
