package com.acme.lavatriciRest.persone.clienti.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciClienteRequest {

	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String partitaIva;

}
