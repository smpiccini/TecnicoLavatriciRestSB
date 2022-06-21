package com.acme.lavatriciRest.persone.clienti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.persone.clienti.ClienteFisicoRepository;
import com.acme.lavatriciRest.persone.clienti.ClienteGiuridicoRepository;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteRequest;

@RestController
@RequestMapping("/clienti")
public class ClienteController {
	@Autowired
	private ClienteFisicoRepository clienteFisicoRepo;
	@Autowired
	private ClienteGiuridicoRepository clienteGiuridicoRepo;
	
	//@PostMapping
	/*public ResponseEntity<?> inserisciCliente
		(@RequestBody InserisciClienteRequest dto) {
		
	}*/

}
