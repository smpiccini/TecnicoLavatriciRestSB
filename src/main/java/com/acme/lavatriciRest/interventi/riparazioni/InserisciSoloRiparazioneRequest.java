package com.acme.lavatriciRest.interventi.riparazioni;

import javax.persistence.Column;

import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciSoloRiparazioneRequest {
	private String codiceIntervento;
	private String descrizione;
	private double prezzo;
	private String dataIntervento;

}
