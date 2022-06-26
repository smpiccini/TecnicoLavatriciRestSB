package com.acme.lavatriciRest.interventi;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InserisciInterventoETecnicoResponse {
	private String nome;
	private String cognome;
	private String matricola;
	
	
	private List<InterventoImp> interventiEffettuati;
	
	

}
