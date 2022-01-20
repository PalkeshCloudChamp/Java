package com.formsExpress.Controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formsExpress.Repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@GetMapping("/user/{customer_id}")
	public void getUser(@PathVariable("customer_id") int customer_id) {
		userRepo.getAllUsers(customer_id).forEach(e->{
			System.out.println(e);
		});
	}
	
	@GetMapping("/grants")
	public void getGrants() {
	}
}
