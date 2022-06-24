package com.acme.lavatriciRest.persone.clienti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.persone.clienti.ClienteImp;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteGiuridicoRequest;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteResponse;

@RestController
@RequestMapping("/clientiGiuridici")
public class ClienteGiuridicoController {
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<?> inserisciCliente
		(@RequestBody InserisciClienteGiuridicoRequest dto) {
		ClienteImp cliente = clienteService.getClienteGiuridico(dto);
		HttpStatus status;
		if (cliente != null) {
			status = HttpStatus.NOT_ACCEPTABLE;
		} else {
			cliente = clienteService.inserisciCliente(dto);
			status = HttpStatus.OK;
		}
		InserisciClienteResponse resp = new InserisciClienteResponse();
		resp.setIdCliente(cliente.getId());
		return new ResponseEntity(resp, status);
	}
}
