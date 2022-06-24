package com.acme.lavatriciRest.rapportino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.interventi.InterventoRepository;
import com.acme.lavatriciRest.persone.Tecnico.TecnicoRepository;
import com.acme.lavatriciRest.persone.clienti.ClienteFisicoRepository;
import com.acme.lavatriciRest.persone.clienti.ClienteGiuridicoRepository;

@RestController
@RequestMapping("/rapportini")
public class RapportinoController {
	
	/*
	@Autowired
	private ClienteFisicoRepository ClienteFisRepo;
	
	@Autowired
	private ClienteGiuridicoRepository ClienteGiuRepo;
	
	@Autowired
	private TecnicoRepository TecnicoRepo;
	*/
	
	@Autowired
	private InterventoRepository InterventoRepo;
	
	@Autowired
	private RapportinoRepository RapportinoRepo;
	
	@Autowired
	RapportinoService rapportinoService;
	
	
	@PostMapping
	public ResponseEntity<?> inserisciSoloRapportino(@RequestBody InserisciSoloRapportinoRequest dto) {
		rapportinoService.inserisciSoloRapportino(dto);
		return ResponseEntity.ok("Rapportino salavto");
	}
	

}
