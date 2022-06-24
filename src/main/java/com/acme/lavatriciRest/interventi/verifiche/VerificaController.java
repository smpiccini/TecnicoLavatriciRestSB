package com.acme.lavatriciRest.interventi.verifiche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.interventi.InterventoService;

@RestController
@RequestMapping("/verifica")
public class VerificaController {
	
@Autowired
private InterventoService interventoService;

@PostMapping
public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciVerificaRequeste dto){
	interventoService.inserisciIntervento(dto);
	return ResponseEntity.ok("Verifica aggiunta");
	
}

}
