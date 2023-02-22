package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class name{
	private String StudentName="Malavika";
	@GetMapping("/")
	public String getName() {
		return "Welcome "+StudentName;
	}

}