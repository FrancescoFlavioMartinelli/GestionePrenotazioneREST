package com.epicode.model;

import javax.persistence.Entity;

@Entity
public class Utente {

	@Id
	private Long id;
	private String name;
}
