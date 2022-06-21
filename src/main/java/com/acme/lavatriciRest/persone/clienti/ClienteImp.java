package com.acme.lavatriciRest.persone.clienti;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.lavatriciRest.persone.PersonaImp;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

@Entity
@Table(name = "clienti")
public class ClienteImp extends PersonaImp {


	public ClienteImp(long id, String nome, String cognome) {
		super(id, nome, cognome);

	}

}
