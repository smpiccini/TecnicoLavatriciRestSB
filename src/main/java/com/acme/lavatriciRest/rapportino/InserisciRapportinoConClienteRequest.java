package com.acme.lavatriciRest.rapportino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InserisciRapportinoConClienteRequest {
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String partitaIva;
	private String numeroSeriale;
	private String dataRapportino;
	

	
	

}
