package com.acme.lavatriciRest.rapportino;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.acme.lavatriciRest.interventi.InterventoImp;
import com.acme.lavatriciRest.persone.clienti.ClienteImp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rapportini")
@Entity
public class RapportinoImp implements Rapportino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String numeroSeriale;
	private String dataRapportino;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@JsonIgnoreProperties({"rapportini"})
	@ManyToOne
	private ClienteImp cliente;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@JsonIgnoreProperties({"rapportino"})
	@OneToMany(mappedBy = "rapportino")
	private List<InterventoImp> interventi;
	
	public RapportinoImp(long id, String numeroSeriale, String dataRapportino, ClienteImp cliente) {
		this.id = id;
		this.numeroSeriale = numeroSeriale;
		this.dataRapportino = dataRapportino;
		this.cliente = cliente;
	}
	
}
