package com.acme.lavatriciRest.persone.Tecnico;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;


public class TecnicoServiceImp implements TecnicoService{

	@Autowired
	TecnicoService tecnicoService;
	
	@Autowired
	TecnicoRepository tecnicoRepository;
	
	@Override
	public Tecnico inserisciTecnico(@RequestBody InserisciTecnicoRequest dto) {
		Tecnico tec;
		
		if(tecnicoRepository.existsByMatricola(dto.getMatricola())) {
			tec = tecnicoRepository.findByMatricola(dto.getMatricola());
		}else {
			
			tec = new Tecnico();
			
			BeanUtils.copyProperties(dto, tec);
			tecnicoRepository.save(tec);
		}
		return tec;
	}		

}
