package com.acme.lavatriciRest.interventi.verifiche;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.acme.lavatriciRest.interventi.riparazioni.Riparazione;

@Repository
public interface VerificaRepository extends PagingAndSortingRepository<Verifica, Long> {
	public boolean existsByCodiceIntervento(String codiceIntervento);
	public Verifica findByCodiceIntervento(String codiceIntervento);
}
