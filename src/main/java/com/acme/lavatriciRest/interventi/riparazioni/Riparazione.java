package com.acme.lavatriciRest.interventi.riparazioni;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.persone.Tecnico.Tecnico;
import com.acme.lavatriciRest.rapportino.RapportinoImp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "riparazioni")
public class Riparazione extends InterventoImp {

	public Riparazione(long id, String descrizione, double prezzo, 
			String dataIntervento, Tecnico tecnico, RapportinoImp rapportino) {
		super(id, descrizione, prezzo, dataIntervento, tecnico, rapportino);
	}
	

}
