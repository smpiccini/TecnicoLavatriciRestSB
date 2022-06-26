package com.acme.lavatriciRest.interventi;

import com.acme.lavatriciRest.interventi.riparazioni.InserisciRiparazioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.riparazioni.InserisciSoloRiparazioneRequeste;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSoloSostituzioneRequeste;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSostituzioneConTecnicoRequest;
import com.acme.lavatriciRest.interventi.verifiche.InserisciSoloVerificaRequeste;
import com.acme.lavatriciRest.interventi.verifiche.InserisciVerificaConTecnicoRequest;

public interface InterventoService {
	InterventoImp inserisciIntervento(InserisciSoloRiparazioneRequeste dto);
	InterventoImp inserisciIntervento(InserisciSoloSostituzioneRequeste dto);
	InterventoImp inserisciIntervento(InserisciSoloVerificaRequeste dto);
	InterventoImp inserisciIntervento(InserisciRiparazioneConTecnicoRequest dto);
	InterventoImp inserisciIntervento(InserisciVerificaConTecnicoRequest dto);
	InterventoImp inserisciIntervento(InserisciSostituzioneConTecnicoRequest dto);
	
	

}
