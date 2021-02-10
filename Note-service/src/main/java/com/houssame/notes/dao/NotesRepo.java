package com.houssame.notes.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.houssame.notes.entities.Note;

@Repository
public interface NotesRepo extends JpaRepository<Note, Long>{
	public Collection<Note> getByIdEtudiant(long id);
}
