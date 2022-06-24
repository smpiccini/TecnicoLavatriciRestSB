package com.acme.lavatriciRest.rapportino;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RapportinoRepository extends PagingAndSortingRepository<RapportinoImp, Long> {
		public boolean existsByNumeroSeriale(String numeroSeriale);
		public Rapportino findByNumeroSeriale(String numeroSeriale);
}
