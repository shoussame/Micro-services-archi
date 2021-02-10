package com.houssame.etudiant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.houssame.etudiant.entities.Etudiant;
import com.houssame.etudiant.service.IEtudiantService;

@SpringBootApplication
public class EtudiantsServiceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(EtudiantsServiceApplication.class, args);
	}
	@Bean CommandLineRunner start(IEtudiantService service) {
		return args -> {
			service.addEtudiant(new Etudiant("Frayji", "Amine", "Q52114", "16/03/1999"));
			service.addEtudiant(new Etudiant("Qabli", "Reda", "Q09904", "06/05/1999"));
			service.addEtudiant(new Etudiant("Kouhail", "Hicham", "A52314", "10/03/2001"));
		};
	}

}
