package com.acme.lavatriciRest.persone.clienti;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

@Entity
@Table (name = "clienti_giuridici")
public class ClienteGiuridico extends ClienteImp {

	private String partitaIva;
	
	public ClienteGiuridico(long id, String nome, String cognome, String partitaIva) {
		super(id, nome, cognome);
		this.partitaIva = partitaIva;
	}
}


