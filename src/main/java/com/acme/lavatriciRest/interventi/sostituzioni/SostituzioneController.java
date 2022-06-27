package com.acme.lavatriciRest.interventi.sostituzioni;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.lavatriciRest.interventi.InserisciInterventoConTecnicoResponse;
import com.acme.lavatriciRest.interventi.InserisciInterventoResponse;
import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.interventi.InterventoService;

@RestController
@RequestMapping("/sostituzione")
public class SostituzioneController {
	
	@Autowired
	private InterventoService interventoService;
	
	@PostMapping("/soloSostituzioni")
	public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciSoloSostituzioneRequest dto){
		InterventoImp inter=interventoService.getInterventoSostituzione(dto.getCodiceIntervento());
		HttpStatus status;
		if (inter != null) {
			status = HttpStatus.NOT_ACCEPTABLE;
		} else {
			inter = interventoService.inserisciIntervento(dto);
			status = HttpStatus.OK;
		
	}
		InserisciInterventoResponse resp = new InserisciInterventoResponse();
		resp.setIdIntervento(inter.getId());
		return new ResponseEntity(resp, status);
		
	}		
		
	@PostMapping
	public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciSostituzioneConTecnicoRequest dto) {
		InterventoImp inter= interventoService.getInterventoSostituzione(dto.getCodiceIntervento());
		HttpStatus status;
		if (inter !=null) {
			status = HttpStatus.NOT_ACCEPTABLE;
		} else {
			inter = interventoService.inserisciInterventoConTecnico(dto);
			status = HttpStatus.OK;
		}
		InserisciInterventoConTecnicoResponse resp= new InserisciInterventoConTecnicoResponse();
		
		BeanUtils.copyProperties(inter.getTecnico(), resp);
		resp.setIdIntervento(inter.getId());
		resp.setIdTecnico(inter.getTecnico().getId());
		return ResponseEntity.ok(resp);
	}
}
