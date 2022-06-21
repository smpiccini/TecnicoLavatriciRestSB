package com.acme.lavatriciRest.rapportino;

import com.acme.lavatriciRest.persone.clienti.ClienteImp;

public interface Rapportino {

	String getDataRapportino();

	long getId();

	ClienteImp getCliente();

	String getNumeroSeriale();

	void setDataRapportino(String dataRapportino);

	void setId(long id);

	void setCliente(ClienteImp cliente);

	void setNumeroSeriale(String numeroSeriale);

}
