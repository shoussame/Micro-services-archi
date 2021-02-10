package com.houssame.etudiant.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Etudiant {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	private String cin;
	private String dateDeNaissance;
	@Transient
	private Collection<Note> notes;
	public Etudiant(String nom, String prenom, String cin, String dateDeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.dateDeNaissance = dateDeNaissance;
	}
	
}
