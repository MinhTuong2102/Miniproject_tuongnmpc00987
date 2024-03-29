package com.mini_project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini_project.dao.ProductDAO;
import com.mini_project.entity.Product;
import com.mini_project.services.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDAO pdao ;

	@Override
	public List<Product> findAll() {	
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {		
		return pdao.save(product);
	}

	@Override
	public Product update(Product product) {
		return pdao.save(product);
	}

	@Override
	public void delete(Integer id) {
		pdao.deleteById(id);;
	}
}
