package com.acme.lavatriciRest.persone.clienti;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "cliente_giuridico")
public class ClienteGiuridico extends ClienteImp {

	private String partitaIva;
	
	public ClienteGiuridico(long id, String nome, String cognome, String partitaIva) {
		super(id, nome, cognome);
		this.partitaIva = partitaIva;
	}
}


