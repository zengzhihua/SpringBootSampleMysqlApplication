package com.example.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String helloworld(){
		return "Hello world!";
	}
	
	@RequestMapping("/hello/{name}")
	public String hellName(@PathVariable String name){
		return "Hello "+name;
	}
}
