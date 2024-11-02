package com.aman.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {
	
	@Autowired
	private Dog dog; // mang rha hu dog ka object
   
	// mang raha hu dog ka object de do mujhe via autowiring
	// called dependency car depend on dog
	// we do inject inside the car
	// using autowired annotation
	
	// autowired ke through ek hi dog hai aur har class ko ush single god 
	// ka copy pakra denge
	
	@GetMapping("/ok")
	public String ok() {
		return dog.fun();
	}

}
