package com.houssame.notes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.houssame.notes.entities.Note;
import com.houssame.notes.rest.NoteService;

@SpringBootApplication
public class NoteServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(NoteServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(NoteService noteService) {
		return args -> {
			noteService.addNote(new Note(1, "BI", 15));
			noteService.addNote(new Note(2, "Dev", 17));
			noteService.addNote(new Note(3, "Android", 16));
		};
	}

}
