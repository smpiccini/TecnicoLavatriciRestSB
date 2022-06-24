package com.acme.lavatriciRest.interventi.sostituzioni;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SostituzioneRepository extends PagingAndSortingRepository<Sostituzione, Long> {

}
