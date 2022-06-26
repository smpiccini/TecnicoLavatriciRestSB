package com.acme.lavatriciRest.rapportino;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import com.acme.lavatriciRest.interventi.Intervento;
import com.acme.lavatriciRest.persone.Tecnico.InserisciTecnicoRequest;
import com.acme.lavatriciRest.persone.Tecnico.Tecnico;
import com.acme.lavatriciRest.persone.Tecnico.TecnicoService;
import com.acme.lavatriciRest.persone.clienti.ClienteImp;
import com.acme.lavatriciRest.persone.clienti.controller.ClienteService;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;
import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteGiuridicoRequest;

@Service
public class RapportinoServiceImp implements RapportinoService{
	@Autowired RapportinoRepository rapportinoRepository;
	@Autowired
	TecnicoService tecnicoService;
	@Autowired
	ClienteService clienteService;
	
	
	@Override
	public Rapportino inserisciSoloRapportino(InserisciSoloRapportinoRequest dto) {

		Rapportino rap;
		
		if(rapportinoRepository.existsByNumeroSeriale(dto.getNumeroSeriale())) {
			rap = rapportinoRepository.findByNumeroSeriale(dto.getNumeroSeriale());
		} else {
			rap = new RapportinoImp();
			BeanUtils.copyProperties(dto, rap);
			rapportinoRepository.save((RapportinoImp) rap);	
		}
		return rap;
		
		
	
	}

	@Override
	public Rapportino getRapportino(String numeroSeriale) {
		Rapportino rap=null;
		if(rapportinoRepository.existsByNumeroSeriale(numeroSeriale)) {
			rap = rapportinoRepository.findByNumeroSeriale(numeroSeriale);
		}
		return rap;
	}

	@Override
	public Rapportino inserisciRapportinoConCliente(InserisciRapportinoConClienteRequest dto) {	
		InserisciClienteFisicoRequest cliFisicoDto;
		InserisciClienteGiuridicoRequest cliGiuridicoDto;
		ClienteImp cli;
		
		if(dto.getCodiceFiscale() != null) {
		 cliFisicoDto = new InserisciClienteFisicoRequest();
		 BeanUtils.copyProperties(dto,  cliFisicoDto);
		cli = clienteService.inserisciCliente(cliFisicoDto);
		} else {
			
		cliGiuridicoDto = new InserisciClienteGiuridicoRequest();
		 BeanUtils.copyProperties(dto,  cliGiuridicoDto);
		 cli = clienteService.inserisciCliente(cliGiuridicoDto);
		}
		
		RapportinoImp rap = new RapportinoImp();
		BeanUtils.copyProperties(dto, rap);
		rap.setCliente(cli);
		rapportinoRepository.save(rap);		
		return rap;
	}	
		
}

	
	
