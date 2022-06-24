package com.acme.lavatriciRest.interventi;

import com.acme.lavatriciRest.interventi.riparazioni.InserisciRiparazioneRequeste;
import com.acme.lavatriciRest.interventi.sostituzioni.InserisciSostituzioneRequeste;
import com.acme.lavatriciRest.interventi.verifiche.InserisciVerificaRequeste;

public interface InterventoService {
	InterventoImp inserisciIntervento(InserisciRiparazioneRequeste dto);
	InterventoImp inserisciIntervento(InserisciSostituzioneRequeste dto);
	InterventoImp inserisciIntervento(InserisciVerificaRequeste dto);
	

}
