package com.houssame.notes.rest;

import java.util.Collection;

import com.houssame.notes.entities.Note;

public interface IRestService {
	public Note addNote(Note note);
	public void deleteNote(long id);
	public Collection<Note> getNotesForEtudiant(long idEtudiant);
	public Collection<Note> getAllNotes();
}
