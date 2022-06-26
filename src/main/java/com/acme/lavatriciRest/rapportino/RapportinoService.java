package com.acme.lavatriciRest.rapportino;


public interface RapportinoService {
	
	Rapportino inserisciSoloRapportino(InserisciSoloRapportinoRequest dto);
	Rapportino getRapportino(String numeroSeriale);
	Rapportino inserisciRapportinoConCliente(InserisciRapportinoConClienteRequest dto);

}
