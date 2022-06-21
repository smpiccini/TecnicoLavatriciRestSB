package com.acme.lavatriciRest.interventi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.acme.lavatriciRest.persone.Tecnico.Tecnico;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "interventi")
public class InterventoImp implements Intervento {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column(length = 30, nullable = false)
	private String descrizione;
	
	private double prezzo;
	@Column(length = 30, nullable = false)
	private String dataIntervento;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@JsonIgnoreProperties({"interventi"})
	@ManyToOne
	private Tecnico tecnico;

}
