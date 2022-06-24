package com.acme.lavatriciRest.persone.clienti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.persone.clienti.ClienteFisicoRepository;
import com.acme.lavatriciRest.persone.clienti.ClienteGiuridicoRepository;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;

//TODO: suddividi i controller
@RestController
@RequestMapping("/clienti")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<?> inserisciCliente
		(@RequestBody InserisciClienteFisicoRequest dto) {
		clienteService.inserisciCliente(dto);
		
		return ResponseEntity.ok("Cliente fisico aggiunto.");
	}

}
