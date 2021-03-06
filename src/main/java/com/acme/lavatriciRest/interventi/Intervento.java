package com.acme.lavatriciRest.interventi;

import com.acme.lavatriciRest.persone.Tecnico.Tecnico;

public interface Intervento {

	String getDataIntervento();
	
	String getCodiceIntervento();

	String getDescrizione();

	long getId();

	double getPrezzo();

	Tecnico getTecnico();

	void setDataIntervento(String dataIntervento);
	
	void setCodiceIntervento(String codiceIntervento);

	void setDescrizione(String descrizione);

	void setId(long id);

	void setPrezzo(double prezzo);

	void setTecnico(Tecnico tecnico);

}