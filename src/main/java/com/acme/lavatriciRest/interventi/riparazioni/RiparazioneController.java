package com.acme.lavatriciRest.interventi.riparazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.interventi.InterventoService;
import com.acme.lavatriciRest.interventi.verifiche.InserisciVerificaRequeste;

@RestController
@RequestMapping("/riparazione")
public class RiparazioneController {
	
	@Autowired
	private InterventoService interventoService;

	@PostMapping
	public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciRiparazioneRequeste dto){
		interventoService.inserisciIntervento(dto);
		return ResponseEntity.ok("Intervento aggiunto");

}
}
