package com.acme.lavatriciRest.persone.Tecnico;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.persone.PersonaImp;
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
@Table(name = " tecnici")
public class Tecnico extends PersonaImp {
	
	private String matricola;

	@ToString.Exclude
	@JsonIgnoreProperties({"tecnico"})
	@OneToMany(mappedBy = "tecnico")
	private List<InterventoImp> interventi= new ArrayList<InterventoImp>();
	
	public Tecnico(long id, String nome, String cognome, String matricola) {
		super(id, nome, cognome);
		this.matricola = matricola;
	}

}
