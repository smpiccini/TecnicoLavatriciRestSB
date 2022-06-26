package com.acme.lavatriciRest.interventi.sostituzioni;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.acme.lavatriciRest.interventi.riparazioni.Riparazione;

@Repository
public interface SostituzioneRepository extends PagingAndSortingRepository<Sostituzione, Long> {
	public boolean existsByCodiceIntervento(String codiceIntervento);
	public Sostituzione findByCodiceIntervento(String codiceIntervento);
}
