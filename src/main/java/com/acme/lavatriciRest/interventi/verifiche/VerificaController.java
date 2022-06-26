package com.acme.lavatriciRest.interventi.verifiche;

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
@RequestMapping("/verifica")
public class VerificaController {
	
@Autowired
private InterventoService interventoService;

@PostMapping("/soloVerifica")
public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciSoloVerificaRequest dto){
	interventoService.inserisciIntervento(dto);
	return ResponseEntity.ok("Verifica aggiunta");
	
}
@PostMapping
public ResponseEntity<?> inserisciIntervento (@RequestBody InserisciVerificaConTecnicoRequest dto) {
	InterventoImp inter= interventoService.inserisciIntervento(dto);
	InserisciInterventoConTecnicoResponse resp= new InserisciInterventoConTecnicoResponse();
	
	BeanUtils.copyProperties(inter.getTecnico(), resp);
	resp.setInterventiEffettuati(inter.getTecnico().getInterventi());
	return ResponseEntity.ok(resp);
}
}
