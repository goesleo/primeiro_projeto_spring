package com.devsuperior.myfirstproject.repositories;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.devsuperior.myfirstproject.entities.product;

@Component
public class ProductRepository {
	
	private Map<Long, product> map = new HashMap<>();
	

	public void save(product obj) {
		map.put(obj.getId(), obj);
	}

	public product findById(Long id) {
		return map.get(id);
	}
	
	public List<product> findAll() {
		return new ArrayList<product>(map.values());
	}
}