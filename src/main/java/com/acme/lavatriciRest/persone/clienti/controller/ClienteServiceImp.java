package com.acme.lavatriciRest.persone.clienti.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.lavatriciRest.persone.clienti.ClienteFisico;
import com.acme.lavatriciRest.persone.clienti.ClienteFisicoRepository;
import com.acme.lavatriciRest.persone.clienti.ClienteGiuridico;
import com.acme.lavatriciRest.persone.clienti.ClienteGiuridicoRepository;
import com.acme.lavatriciRest.persone.clienti.ClienteImp;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteGiuridicoRequest;



@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired
	private ClienteFisicoRepository clienteFisicoRepo;
	@Autowired
	private ClienteGiuridicoRepository clienteGiuridicoRepo;
	
	
	@Override
	public ClienteImp inserisciCliente(InserisciClienteFisicoRequest dto) {
		ClienteFisico cli = new ClienteFisico();
		BeanUtils.copyProperties(dto, cli);
		clienteFisicoRepo.save(cli);
		
		return cli;
	}
	
	public ClienteImp inserisciCliente(InserisciClienteGiuridicoRequest dto) {
		ClienteGiuridico cli = new ClienteGiuridico();
		BeanUtils.copyProperties(dto, cli);
		clienteGiuridicoRepo.save(cli);
		
		return cli;
	}

}
