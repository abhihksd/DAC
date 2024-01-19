package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contact;
import com.example.demo.services.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService cservice;
	
	@GetMapping("/getall")
	public List<Contact> getAll()
	{
		return cservice.getAll();
	}
}
