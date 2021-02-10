package com.houssame.notes.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class Etudiant {
	private long id;
	private String nom;
	private String prenom;
	private String cin;
	private Date dateDeNaissance;
	private Collection<Note> notes;
}
