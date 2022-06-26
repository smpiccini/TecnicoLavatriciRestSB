package com.acme.lavatriciRest.interventi.sostituzioni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InserisciSostituzioneConTecnicoRequest {
	private String codiceIntervento;
	private String descrizione;
	private double prezzo;
	private String dataIntervento;
	private int numeroPezzi;
	private String nome;
	private String cognome;
	private String matricola;

}
