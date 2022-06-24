package com.acme.lavatriciRest.persone.clienti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteGiuridicoRequest;

@RestController
@RequestMapping("/clientiGiuridici")
public class ClienteGiuridicoController {
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<?> inserisciCliente
		(@RequestBody InserisciClienteGiuridicoRequest dto) {
		clienteService.inserisciCliente(dto);
		
		return ResponseEntity.ok("Cliente giuridico aggiunto.");
	}
}
