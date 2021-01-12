package com.algaworks.osworks.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;


@RestController
public class ClienteController {
	
	
	@GetMapping("/cliente")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Leticia");
		cliente1.setTelefone("1111-2344");
		cliente1.setEmail("paula.leticia.braz@gmail.com");
		
		var cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Paula");
		cliente2.setTelefone("1111-2344");
		cliente2.setEmail("paula.leticia.braz@gmail.com");
		return Arrays.asList(cliente1, cliente2);
		
	}

}
