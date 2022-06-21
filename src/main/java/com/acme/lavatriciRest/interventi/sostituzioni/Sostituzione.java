package com.acme.lavatriciRest.interventi.sostituzioni;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.persone.Tecnico.Tecnico;

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

	public Sostituzione(long id, String descrizione, double prezzo, String dataIntervento, Tecnico tecnico, int numeroPezzi) {
		super(id, descrizione, prezzo, dataIntervento, tecnico);
		this.numeroPezzi=numeroPezzi;

	}

}
