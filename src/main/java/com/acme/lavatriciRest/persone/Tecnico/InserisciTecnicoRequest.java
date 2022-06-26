package com.acme.lavatriciRest.persone.Tecnico;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciTecnicoRequest {

	private String matricola;
	private String nome;
	private String cognome;
	private String dataIntervento;
	private String descrizione;
}
