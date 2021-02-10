package com.houssame.etudiant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houssame.etudiant.entities.Etudiant;

public interface EtudiantRepo extends JpaRepository<Etudiant, Long>{
	public Etudiant findByNom(String nom);
	public Etudiant findEtudiantById(long id);
}
