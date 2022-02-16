package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	
	public String getHello()
	{
		return "Hello World!";
	}
	@GetMapping("/bsm")
	
	public String getBsm()
	{
		return "Utilizei principalmente a persistência e atenção aos detalhes pra entender como fazerkkkk";
	}
	
	@GetMapping("/objetivo")
	public String getObjetivo()
	{
		return "Aprender o máximo possível sobre programação no Spring.";
	}

}
