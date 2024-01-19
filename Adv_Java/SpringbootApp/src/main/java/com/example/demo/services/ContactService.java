package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Contact;
import com.example.demo.repositories.ContactRepository;

@Service
public class ContactService {
	@Autowired
	ContactRepository crepo;
	
	public List<Contact> getAll()
	{
		return crepo.findAll();
	}

}
