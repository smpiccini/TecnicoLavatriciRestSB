package com.acme.lavatriciRest.persone.clienti;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteGiuridicoRepository extends PagingAndSortingRepository<ClienteGiuridico, Long> {
	public boolean existsByPartitaIva(String partitaIva);
	public ClienteImp findByPartitaIva(String partitaIva);
}
