package br.com.ufrn.negocio;

import org.springframework.stereotype.Component;

@Component
public class HelloNegocio {
	
	public String message(String name) {
		return name == null ? "World" : name;
	}
	
}
