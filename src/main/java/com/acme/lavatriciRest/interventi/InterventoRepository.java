package com.acme.lavatriciRest.interventi;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterventoRepository extends PagingAndSortingRepository<InterventoImp, Long> {


}
