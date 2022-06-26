package com.acme.lavatriciRest.persone.Tecnico;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class TecnicoController {
	@Autowired
	TecnicoService tecnicoService;
	
	@PostMapping
	public ResponseEntity<?> inserisciTecnico
	(@RequestBody InserisciTecnicoRequest dto) {
	Tecnico tc = tecnicoService.getTecnico(dto);
	HttpStatus status;
	if (tc != null) {
		status = HttpStatus.NOT_ACCEPTABLE;
	} else {
		tc = tecnicoService.inserisciTecnico(dto);
		status = HttpStatus.OK;
	}
	InserisciTecnicoResponse resp = new InserisciTecnicoResponse();
	resp.setIdTecnico(resp.getIdTecnico());
	return new ResponseEntity(resp, status);
}
	/*
	  @GetMapping("")
	 
	public ResponseEntity<?> getTecnico(@PathVariable String nome, String cognome ) {
		if(tecnicoRepository.existByNomeECognome(nome, cognome)) {
			Tecnico t = tecnicoRepository.findByNomeECognome(nome, cognome);
			
			return new ResponseEntity(t, HttpStatus.OK);
		} else {
			return new ResponseEntity("Tecnico " + nome + " " + cognome + " non trovato!", HttpStatus.NOT_FOUND);
		}
	}

	
	@PutMapping
	public ResponseEntity<String> updateTecnico ( @RequestBody Tecnico tecnico, String matricola) {
		if(tecnicoRepository.existsByMatricola(matricola)) {
			Tecnico tecnicoEsistente = tecnicoRepository.findByMatricola(matricola);
			BeanUtils.copyProperties(tecnico, tecnicoEsistente);
			tecnicoRepository.save(tecnicoEsistente);
			return new ResponseEntity<String> ("Tecnico " + matricola + " aggiornato", HttpStatus.OK);
		} else {
			return new ResponseEntity<String> ("Utente " + matricola + " non trovato" , HttpStatus.NOT_FOUND);
		}
	}*/
}
