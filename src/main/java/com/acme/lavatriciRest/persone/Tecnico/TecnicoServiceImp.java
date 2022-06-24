package com.acme.lavatriciRest.persone.Tecnico;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.acme.lavatriciRest.interventi.InterventoRepository;

public class TecnicoServiceImp implements TecnicoService{

	@Autowired
	TecnicoService tecnicoService;
	
	@Autowired
	TecnicoRepository tecnicoRepository;
	
	@Autowired
	InterventoRepository interventoRepository;
	
	@Override
	public Tecnico inserisciTecnico(@RequestBody InserisciTecnicoRequest dto) {
		Tecnico tec;
		
		if(tecnicoRepository.existByNomeECognome(dto.getNome(), dto.getCognome())) {
			tec = tecnicoRepository.findByNomeECognome(dto.getNome(), dto.getCognome());
		}else {
			
			tec = new Tecnico();
			
			BeanUtils.copyProperties(dto, tec);
			tecnicoRepository.save(tec);
		}
		return tec;
	}		

}
