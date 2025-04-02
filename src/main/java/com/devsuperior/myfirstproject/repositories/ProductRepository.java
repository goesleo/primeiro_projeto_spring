package com.devsuperior.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.product;

@Repository
public interface ProductRepository extends JpaRepository<product, Long>{
	

}