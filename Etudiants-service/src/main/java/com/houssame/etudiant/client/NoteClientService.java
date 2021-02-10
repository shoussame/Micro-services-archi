package com.houssame.etudiant.client;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.houssame.etudiant.entities.Note;

@FeignClient(name = "note-service")
public interface NoteClientService {
	@GetMapping("/note/{idEtud}")
	public Collection<Note> getEtudiantNotes(long id);
}
