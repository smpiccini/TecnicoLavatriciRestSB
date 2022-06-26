package com.acme.lavatriciRest.interventi.riparazioni;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.interventi.InserisciInterventoETecnicoResponse;
import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.interventi.InterventoService;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSostituzioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.verifiche.InserisciSoloVerificaRequeste;
import com.acme.lavatriciRest.interventi.verifiche.InserisciVerificaConTecnicoRequest;

@RestController
@RequestMapping("/riparazione")
public class RiparazioneController {
	
	@Autowired
	private InterventoService interventoService;

	@PostMapping("/soloIntervento")
	public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciSoloRiparazioneRequeste dto){
		interventoService.inserisciIntervento(dto);
		return ResponseEntity.ok("Intervento aggiunto");
	}	
		
	@PostMapping
	public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciRiparazioneConTecnicoRequest dto) {
		InterventoImp inter= interventoService.inserisciIntervento(dto);
		InserisciInterventoETecnicoResponse resp= new InserisciInterventoETecnicoResponse();
		
		BeanUtils.copyProperties(inter.getTecnico(), resp);
		resp.setInterventiEffettuati(inter.getTecnico().getInterventi());
		return ResponseEntity.ok(resp);
	}
	

	
}
