package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class ProducerController {
	
	@GetMapping("/Employee")
	public Employee getData()
	{
		return new Employee(1,"Lokesh","Pune");
	}
}
