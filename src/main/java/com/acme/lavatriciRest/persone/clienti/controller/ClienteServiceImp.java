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
		ClienteFisico cli;
		if(clienteFisicoRepo.existsByCodiceFiscale(dto.getCodiceFiscale())) {
			cli = (ClienteFisico) clienteFisicoRepo.findByCodiceFiscale(dto.getCodiceFiscale());
		}else {
			
			cli = new ClienteFisico();
			
			BeanUtils.copyProperties(dto, cli);
			clienteFisicoRepo.save(cli);
		}
		return cli;
	}
	
	@Override
	public ClienteImp inserisciCliente(InserisciClienteGiuridicoRequest dto) {
		ClienteGiuridico cli;
		if(clienteGiuridicoRepo.existsByPartitaIva(dto.getPartitaIva())) {
			cli = (ClienteGiuridico) clienteGiuridicoRepo.findByPartitaIva(dto.getPartitaIva());
		}else {
			
			cli = new ClienteGiuridico();
			
			BeanUtils.copyProperties(dto, cli);
			clienteGiuridicoRepo.save(cli);
		}
		return cli;
	}
	
	@Override
	public ClienteImp getClienteFisico(String codiceFiscale) {
		ClienteImp cli = null;
		if(clienteFisicoRepo.existsByCodiceFiscale(codiceFiscale)) {
			cli = clienteFisicoRepo.findByCodiceFiscale(codiceFiscale);
		}
		return cli;
	}

	@Override
	public ClienteImp getClienteGiuridico(String partitaIva) {
		ClienteImp cli = null;
		if(clienteGiuridicoRepo.existsByPartitaIva(partitaIva)) {
			cli = clienteGiuridicoRepo.findByPartitaIva(partitaIva);
		}
		return cli;
	}

}
