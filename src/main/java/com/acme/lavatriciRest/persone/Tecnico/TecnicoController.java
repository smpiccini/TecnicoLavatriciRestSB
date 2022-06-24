package com.acme.lavatriciRest.persone.Tecnico;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.writer.BeansMapper.Bean;

@RestController
@RequestMapping

public class TecnicoController {
	
	TecnicoRepository tecnicoRepository;
	
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
*/
	
	@PostMapping
	public ResponseEntity<String>  insertTecnico (@RequestBody Tecnico tecnico, String nome, String cognome) {
		if(tecnicoRepository.existsByNome(nome)) {
			return new ResponseEntity<String>("Tecnico già esistente", HttpStatus.NOT_ACCEPTABLE);
		} else {
			tecnicoRepository.save(tecnico);
			return ResponseEntity.ok("Tecnico inserito");
		}
	}
	
	@PutMapping
	public ResponseEntity<String> updateTecnico ( @RequestBody Tecnico tecnico, String nome, String cognome) {
		if(tecnicoRepository.existsByNome(nome)) {
			Tecnico tecnicoEsistente = tecnicoRepository.findByNome(nome);
			BeanUtils.copyProperties(tecnico, tecnicoEsistente);
			tecnicoRepository.save(tecnicoEsistente);
			return new ResponseEntity<String> ("Tecnico " + nome + " " + cognome + " aggiornato", HttpStatus.OK);
		} else {
			return new ResponseEntity<String> ("Utente " + nome + " " + cognome + " non trovato" , HttpStatus.NOT_FOUND);
		}
	}
}
