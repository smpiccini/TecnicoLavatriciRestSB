package com.acme.lavatriciRest.persone.clienti;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.acme.lavatriciRest.persone.PersonaImp;
import com.acme.lavatriciRest.rapportino.RapportinoImp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ClienteImp extends PersonaImp {
	
	@ToString.Exclude
	@JsonIgnoreProperties({"cliente"})
	@OneToMany(mappedBy = "cliente")
	private List<RapportinoImp> rapportini;
	
	public ClienteImp(long id, String nome, String cognome) {
		super(id, nome, cognome);

	}

}
