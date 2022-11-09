package com.Akgul.FlowerShop.Entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "flowers")
@AllArgsConstructor
@NoArgsConstructor
public class Flower {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_ıd")
	private int userId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "unıt_ın_stock")
	private int unıtInStock;
	
	@Column(name = "description")
	private String description;
	

}
