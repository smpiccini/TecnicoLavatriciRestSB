package com.acme.lavatriciRest.interventi.riparazioni;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiparazioneRepository extends PagingAndSortingRepository<Riparazione, Long> {
	public boolean existsByCodiceIntervento(String codiceIntervento);
	public Riparazione findByCodiceIntervento(String codiceIntervento);
}
