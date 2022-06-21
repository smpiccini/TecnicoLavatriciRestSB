package com.acme.lavatriciRest.persone.clienti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table (name = " clienti_fisici")
public class ClienteFisico extends ClienteImp {
	private String codiceFiscale;
	
	public ClienteFisico(long id, String nome, String cognome, String codiceFiscale) {
		super(id, nome, cognome);
		this.codiceFiscale = codiceFiscale;
	}
	
}
