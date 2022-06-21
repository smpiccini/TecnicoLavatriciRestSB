package com.acme.lavatriciRest.persone.clienti;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteFisicoRepository extends PagingAndSortingRepository<ClienteFisico, Long> {

}
