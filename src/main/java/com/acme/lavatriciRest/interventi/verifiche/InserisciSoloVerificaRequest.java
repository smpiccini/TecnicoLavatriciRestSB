package com.acme.lavatriciRest.interventi.verifiche;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciSoloVerificaRequest {
	private String codiceIntervento;
	private String descrizione;
	private double prezzo;
	private String dataIntervento;

}
