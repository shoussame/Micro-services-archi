package com.houssame.notes.rest;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.houssame.notes.entities.Note;

@RestController
public class NoteRestService {
	private NoteService noteService;

	public NoteRestService(NoteService noteService) {
		super();
		this.noteService = noteService;
	}
	@PostMapping("/note/add")
	public Note addNote(@RequestBody Note note) {
		return noteService.addNote(note);
	}
	@GetMapping("/note/{idEtudiant}")
	public Collection<Note> getNoteEt(@PathVariable long id){
		return noteService.getNotesForEtudiant(id);
	}
	@GetMapping("/note/all")
	public Collection<Note> getAll(){
		return noteService.getAllNotes();
	}
}
