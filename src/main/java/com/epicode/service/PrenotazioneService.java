package com.epicode.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.model.Prenotazione;
import com.epicode.repos.PrenotazioneRepository;

@Service
public class PrenotazioneService {
	
	@Autowired
	PrenotazioneRepository prenotazioneRepo;
	
	public Prenotazione getPrenId(Long id) {
		Optional<Prenotazione> p = prenotazioneRepo.findById(id);
		if(p.isPresent()) {
			return p;
		} else {
			throw new PrenotazioneException("Prenotazione non trovata");
		}
		
	}
	
	

}
