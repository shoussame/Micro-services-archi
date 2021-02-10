package com.houssame.etudiant.entities;

import lombok.Data;

@Data
public class Note {
	private long id;
	private long idEtudiant;
	private String matiere;
	private long note;
	
}
