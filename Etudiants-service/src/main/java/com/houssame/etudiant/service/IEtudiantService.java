package com.houssame.etudiant.service;

import java.util.Collection;

import com.houssame.etudiant.entities.Etudiant;

public interface IEtudiantService {
	public Etudiant addEtudiant(Etudiant etudiant);
	public Etudiant findById(long id);
	public Etudiant findByNom(String nom);
	public Collection<Etudiant> findAllEtudiants();
	public void deleteEtudiant(long id);
}
