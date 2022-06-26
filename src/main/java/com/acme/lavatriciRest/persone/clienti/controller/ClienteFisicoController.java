package com.acme.lavatriciRest.persone.clienti.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.persone.clienti.ClienteImp;
import com.acme.lavatriciRest.persone.clienti.view.GetClienteResponse;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteResponse;

@RestController
@RequestMapping("/clientiFisici")
public class ClienteFisicoController {
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<?> inserisciCliente
		(@RequestBody InserisciClienteFisicoRequest dto) {
		ClienteImp cliente = clienteService.getClienteFisico(dto.getCodiceFiscale());
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
	
	@GetMapping("/{codiceFiscale}")
	public ResponseEntity<?> getCliente(@PathVariable  String codiceFiscale) {
		ClienteImp cliente = clienteService.getClienteFisico(codiceFiscale);
		GetClienteResponse resp = new GetClienteResponse();
		HttpStatus status;
		if (cliente != null) {
			status = HttpStatus.OK;
			resp.setIdCliente(cliente.getId());
		} else {
			status = HttpStatus.NOT_FOUND;
			resp.setIdCliente(-1);
		}
		return new ResponseEntity(resp, status);
	}
	
	@PutMapping	//NON FUNZIONA
	public ResponseEntity<?> updateCliente ( @RequestBody InserisciClienteFisicoRequest dto, String codiceFiscale) {
		ClienteImp clienteEsistente = clienteService.getClienteFisico(codiceFiscale);
		GetClienteResponse resp = new GetClienteResponse();
		HttpStatus status;
		if (clienteEsistente != null) {
			clienteService.inserisciCliente(dto);
			resp.setIdCliente(clienteEsistente.getId());
			status = HttpStatus.OK;
		} else {
			status = HttpStatus.NOT_FOUND;
			resp.setIdCliente(-1);
		}
		return new ResponseEntity(resp, status);
	}

}
