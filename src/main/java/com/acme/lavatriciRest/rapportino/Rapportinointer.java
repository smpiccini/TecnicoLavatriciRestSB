package com.acme.lavatriciRest.rapportino;

import com.acme.lavatriciRest.interventi.InterventoImp;

public interface Rapportinointer {

	String getDataRapportino();

	long getId();

	InterventoImp getIntervento();

	String getNumeroSeriale();

	void setDataRapportino(String dataRapportino);

	void setId(long id);

	void setIntervento(InterventoImp intervento);

	void setNumeroSeriale(String numeroSeriale);

}