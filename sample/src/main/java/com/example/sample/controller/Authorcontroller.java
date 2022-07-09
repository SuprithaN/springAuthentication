package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.bean.Author;
import com.example.sample.repository.AuthorRepository;

@RestController

public class Authorcontroller {
 
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@PostMapping("/addauth")
	public String addAuthor(@RequestBody Author author) {
		
		String pwd=author.getPassword();
		String encryptedpwd=passwordEncoder.encode(pwd);
		author.setPassword(encryptedpwd);
		authorRepository.save(author);
		return "Author sucessfully added";
		
	}
}
