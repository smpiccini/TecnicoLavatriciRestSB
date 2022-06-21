package com.acme.lavatriciRest.persone.Tecnico;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.lavatriciRest.persone.PersonaImp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor


@Entity
@Table(name = " tecnici")
public class Tecnico extends PersonaImp {
	
	public Tecnico(long id, String nome, String cognome) {
		super(id, nome, cognome);

	}

}
