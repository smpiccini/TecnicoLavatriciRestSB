package com.acme.lavatriciRest.interventi.sostituzioni;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.interventi.InserisciInterventoConTecnicoResponse;
import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.interventi.InterventoService;

@RestController
@RequestMapping("/sostituzione")
public class SostituzioneController {
	
	@Autowired
	private InterventoService interventoService;
	
	@PostMapping("/soloSostituzion")
	public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciSoloSostituzioneRequest dto){
		interventoService.inserisciIntervento(dto);
		return ResponseEntity.ok("Sostituzione aggiunta");
		
	}
	@PostMapping
	public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciSostituzioneConTecnicoRequest dto) {
		InterventoImp inter= interventoService.inserisciIntervento(dto);
		InserisciInterventoConTecnicoResponse resp= new InserisciInterventoConTecnicoResponse();
		
		BeanUtils.copyProperties(inter.getTecnico(), resp);
		resp.setInterventiEffettuati(inter.getTecnico().getInterventi());
		return ResponseEntity.ok(resp);
	}
}
