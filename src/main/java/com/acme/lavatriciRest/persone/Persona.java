package com.acme.lavatriciRest.persone;

public interface Persona {

	boolean equals(java.lang.Object o);

	long getId();

	String getNome();

	void setCognome(String cognome);

	void setId(long id);

	void setNome(String nome);

}