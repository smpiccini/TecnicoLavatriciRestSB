package com.acme.lavatriciRest.rapportino;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import com.acme.lavatriciRest.interventi.Intervento;

@Service
public class RapportinoServiceImp implements RapportinoService{
	@Autowired RapportinoRepository rapportinoRepository;
	
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
		
		
		/*
		Intervento nte = new Intervento();
		BeanUtils.copyProperties(dto, nte);
		nte.setRapportino(rap);
		interventoRepository.save(nte);
		*/
		
	}
}
		
		
		
	
	
