package com.acme.lavatriciRest.interventi.verifiche;

import javax.persistence.Column;

import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciVerificaRequeste {
	private String descrizione;
	private double prezzo;
	private String dataIntervento;

}
