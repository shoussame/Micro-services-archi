package com.houssame.etudiant.service;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.houssame.etudiant.client.NoteClientService;
import com.houssame.etudiant.dao.EtudiantRepo;
import com.houssame.etudiant.entities.Etudiant;

@RestController
public class EtudiantRestService implements IEtudiantService{
	private EtudiantRepo etudiantRepo;
	private NoteClientService noteClientService;
	
	public EtudiantRestService(EtudiantRepo etudiantRepo, NoteClientService noteClientService) {
		super();
		this.etudiantRepo = etudiantRepo;
		this.noteClientService = noteClientService;
	}
	@Override
	@PostMapping("/etudiant/add")
	public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
		return etudiantRepo.save(etudiant);
	}
	@Override
	@GetMapping("/etudiant/{nom}")
	public Etudiant findByNom(@PathVariable String nom) {
		Etudiant e = etudiantRepo.findByNom(nom);
		e.setNotes(noteClientService.getEtudiantNotes(e.getId()));
		return e;
	}
	@Override
	@GetMapping("/etudiant/all")
	public Collection<Etudiant> findAllEtudiants() {
		return etudiantRepo.findAll();
	}
	@Override
	@DeleteMapping("/etudiant/{id}")
	public void deleteEtudiant(@PathVariable long id) {
		etudiantRepo.delete(etudiantRepo.findEtudiantById(id));		
	}
	@Override
	@GetMapping("/etudiant/{id}")
	public Etudiant findById(@PathVariable long id) {
		return etudiantRepo.findEtudiantById(id);
	}

}
