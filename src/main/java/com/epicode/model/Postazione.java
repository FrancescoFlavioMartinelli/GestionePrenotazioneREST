package com.epicode.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Postazione {

	@Id
	private Long id;
	private Tipo tipo;
	private String citta;
}
