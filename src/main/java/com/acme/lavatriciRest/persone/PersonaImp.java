package com.acme.lavatriciRest.persone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "persone")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class  PersonaImp implements Persona {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE )
	private long id;
	private String nome;
	private String cognome;
	
}	
