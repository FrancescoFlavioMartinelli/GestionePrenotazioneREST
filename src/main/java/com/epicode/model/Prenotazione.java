package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Prenotazione {

	@Id
	private Long id;
	private LocalDate date;
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private Postazione postazione;
}
