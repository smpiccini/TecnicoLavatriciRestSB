package com.acme.lavatriciRest.interventi.sostituzioni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciSoloSostituzioneRequest {
	private String codiceIntervento;
	private String descrizione;
	private double prezzo;
	private String dataIntervento;
	private int numeroPezzi;
}
