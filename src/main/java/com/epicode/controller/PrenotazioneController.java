package com.epicode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.model.Prenotazione;
import com.epicode.service.PrenotazioneService;

@RestController
@RequestMapping("/api/prenotazione")
public class PrenotazioneController {
	
	@Autowired
	PrenotazioneService prenotazioneSrv;
	
	@GetMapping("/{id}")
	public ResponseEntity<Prenotazione> getPrenotazioneById(@PathVariable Long id) {
		Prenotazione p = prenotazioneSrv.getPrenId(id);
		return new ResponseEntity(p, HttpStatus.OK);
		
	}
	
}
