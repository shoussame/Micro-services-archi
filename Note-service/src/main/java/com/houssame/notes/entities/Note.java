package com.houssame.notes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Note {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long idEtudiant;
	private String matiere;
	private long note;
	public Note(long ietudiant, String matiere, long note) {
		super();
		this.idEtudiant = ietudiant;
		this.matiere = matiere;
		this.note = note;
	}
	
	
}
