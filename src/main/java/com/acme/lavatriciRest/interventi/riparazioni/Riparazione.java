package com.acme.lavatriciRest.interventi.riparazioni;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.persone.Tecnico.Tecnico;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "riparazioni")
public class Riparazione extends InterventoImp {

	public Riparazione(long id, String descrizione, double prezzo, String dataIntervento, Tecnico tecnico) {
		super(id, descrizione, prezzo, dataIntervento, tecnico);
	}
	

}
