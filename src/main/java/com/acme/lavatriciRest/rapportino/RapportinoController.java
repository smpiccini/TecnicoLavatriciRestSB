package com.acme.lavatriciRest.rapportino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.persone.Tecnico.InserisciTecnicoResponse;
import com.acme.lavatriciRest.persone.Tecnico.TecnicoRepository;
import com.acme.lavatriciRest.persone.clienti.ClienteFisicoRepository;
import com.acme.lavatriciRest.persone.clienti.ClienteGiuridicoRepository;

@RestController
@RequestMapping("/rapportini")
public class RapportinoController {
	
	@Autowired
	RapportinoService rapportinoService;
	
	
	@PostMapping("/soloRapportino")
	public ResponseEntity<?> inserisciSoloRapportino(@RequestBody InserisciSoloRapportinoRequest dto) {
		Rapportino rp = rapportinoService.getRapportino(dto.getNumeroSeriale());
		HttpStatus status;
		if (rp !=null) {
			status = HttpStatus.NOT_ACCEPTABLE;
		} else {
			rp = rapportinoService.inserisciSoloRapportino(dto);
			status = HttpStatus.OK;
		}
			
		InserisciSoloRapportinoResponse resp = new InserisciSoloRapportinoResponse();
		resp.setId(rp.getId());
		return new ResponseEntity(resp, status);
	}
	
		@PostMapping
		public ResponseEntity<?> inserisciRapportinoConCliente(@RequestBody InserisciRapportinoConClienteRequest dto) {
			Rapportino rp = rapportinoService.getRapportino(dto.getNumeroSeriale());
			HttpStatus status;
			if (rp !=null) {
				status = HttpStatus.NOT_ACCEPTABLE;
			} else {
				rp = rapportinoService.inserisciRapportinoConCliente(dto);
				status = HttpStatus.OK;
			}
				
			InserisciRapportinoConClienteResponse resp = new InserisciRapportinoConClienteResponse();
			resp.setIdCliente(rp.getCliente().getId());
			resp.setIdRapportino(rp.getId());
			return new ResponseEntity(resp, status);
}
}