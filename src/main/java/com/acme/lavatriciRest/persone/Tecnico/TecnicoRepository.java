package com.acme.lavatriciRest.persone.Tecnico;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TecnicoRepository extends PagingAndSortingRepository<Tecnico, Long> {
public Tecnico findByMatricola(String matricola);
public boolean existsByMatricola(String matricola);
}
