package com.houssame.notes.rest;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.houssame.notes.dao.NotesRepo;
import com.houssame.notes.entities.Note;

@Transactional
@Service
public class NoteService implements IRestService{
	private NotesRepo noteRepo;
	
	public NoteService(NotesRepo noteRepo) {
		super();
		this.noteRepo = noteRepo;
	}

	@Override
	public Note addNote(Note note) {
		return noteRepo.save(note);
	}
	/*
	@Override
	public Note addEtudiantToNote(long idNote, long idEtudiant) {
		Etudiant e = client.findById(idEtudiant);
		Note n = noteRepo.getOne(idNote);
		n.setEtudiant(e);
		return n;
	} */

	@Override
	public void deleteNote(long id) {
		noteRepo.deleteById(id);
	}

	@Override
	public Collection<Note> getNotesForEtudiant(long idEtudiant) {
		return noteRepo.getByIdEtudiant(idEtudiant);
	}

	@Override
	public Collection<Note> getAllNotes() {
		return noteRepo.findAll();
	}

}
