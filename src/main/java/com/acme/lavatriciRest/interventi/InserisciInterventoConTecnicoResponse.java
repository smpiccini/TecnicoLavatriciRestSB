package com.acme.lavatriciRest.interventi;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InserisciInterventoConTecnicoResponse {
	private long idIntervento;
	private long idTecnico;
}
