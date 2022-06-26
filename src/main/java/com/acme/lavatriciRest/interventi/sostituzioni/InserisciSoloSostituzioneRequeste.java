package com.acme.lavatriciRest.interventi.sostituzioni;

import javax.persistence.Column;

import com.acme.lavatriciRest.persone.clienti.view.InserisciClienteFisicoRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciSoloSostituzioneRequeste {
	private String descrizione;
	private double prezzo;
	private String dataIntervento;
	private int numeroPezzi;


}
