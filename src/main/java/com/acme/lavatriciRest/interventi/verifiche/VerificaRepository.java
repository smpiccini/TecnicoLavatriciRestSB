package com.acme.lavatriciRest.interventi.verifiche;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificaRepository extends PagingAndSortingRepository<Verifica, Long> {

}
