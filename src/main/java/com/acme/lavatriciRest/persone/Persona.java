package com.acme.lavatriciRest.persone;

public interface Persona {

	long getId();

	String getNome();
	
	String getCognome();

	void setCognome(String cognome);

	void setId(long id);

	void setNome(String nome);

}