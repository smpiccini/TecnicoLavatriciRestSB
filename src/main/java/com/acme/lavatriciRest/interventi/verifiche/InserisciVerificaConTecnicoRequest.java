package com.acme.lavatriciRest.interventi.verifiche;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InserisciVerificaConTecnicoRequest {
	private String codiceIntervento;
	private String descrizione;
	private double prezzo;
	private String dataIntervento;
	private String nome;
	private String cognome;
	private String matricola;

}
