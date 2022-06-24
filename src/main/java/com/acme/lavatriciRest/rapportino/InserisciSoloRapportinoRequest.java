package com.acme.lavatriciRest.rapportino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InserisciSoloRapportinoRequest {
	
	private String numeroSeriale;
	private String dataIntervento;

}
