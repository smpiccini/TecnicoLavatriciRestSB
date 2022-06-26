package com.acme.lavatriciRest.interventi.sostituzioni;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.persone.Tecnico.Tecnico;
import com.acme.lavatriciRest.rapportino.RapportinoImp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sostituzioni")
public class Sostituzione extends InterventoImp {
 private int numeroPezzi;

	public Sostituzione(long id, String codiceIntervento, String descrizione, double prezzo, String dataIntervento, Tecnico tecnico, RapportinoImp rapportino, int numeroPezzi) {
		super(id, codiceIntervento, descrizione, prezzo, dataIntervento, tecnico, rapportino);
		this.numeroPezzi=numeroPezzi;

	}

}
