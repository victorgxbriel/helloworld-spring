package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.negocio.HelloNegocio;

@RestController
public class HelloRestController {
	
	@Autowired 
	private HelloNegocio negocio;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", required = false)
		String name) {
		return String.format("Hello %s!", negocio.message(name));
	}
}
