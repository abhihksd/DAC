package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository prepo;
	
	public List<Product> getAll()
	{
		return prepo.findAll();
	}
	
	public Product getone(int pid)
	{
		Product p=null;
		Optional<Product> op=prepo.findById(pid);
		try {
			p=op.get();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return p;
	}

}
