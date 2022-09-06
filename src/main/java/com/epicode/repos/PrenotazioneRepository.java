package com.epicode.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.model.Prenotazione;

@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {

	Optional<Prenotazione> findById(Long id);

}
