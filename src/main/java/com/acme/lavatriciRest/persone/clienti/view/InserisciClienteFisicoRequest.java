package com.acme.lavatriciRest.persone.clienti.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciClienteFisicoRequest {

	private String nome;
	private String cognome;
	private String codiceFiscale;

}
