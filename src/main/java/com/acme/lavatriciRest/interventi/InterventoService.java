package com.acme.lavatriciRest.interventi;

import com.acme.lavatriciRest.interventi.riparazioni.InserisciRiparazioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.riparazioni.InserisciSoloRiparazioneRequest;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSoloSostituzioneRequest;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSostituzioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.verifiche.InserisciSoloVerificaRequest;
import com.acme.lavatriciRest.interventi.verifiche.InserisciVerificaConTecnicoRequest;

public interface InterventoService {
	InterventoImp inserisciIntervento(InserisciSoloRiparazioneRequest dto);
	InterventoImp inserisciIntervento(InserisciSoloSostituzioneRequest dto);
	InterventoImp inserisciIntervento(InserisciSoloVerificaRequest dto);
	InterventoImp inserisciIntervento(InserisciRiparazioneConTecnicoRequest dto);
	InterventoImp inserisciIntervento(InserisciVerificaConTecnicoRequest dto);
	InterventoImp inserisciIntervento(InserisciSostituzioneConTecnicoRequest dto);
	
	InterventoImp getIntervento(InserisciSoloRiparazioneRequest dto);
	InterventoImp getIntervento(InserisciSoloSostituzioneRequest dto);
	InterventoImp getIntervento(InserisciSoloVerificaRequest dto);
	
	

}
