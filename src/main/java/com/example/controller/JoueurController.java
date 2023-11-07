package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.JoueurService;
import com.example.entities.Joueur;

@RestController
public class JoueurController {
	@Autowired
	JoueurService js;
	
	@GetMapping("joueur")
	public List<Joueur> getAllJoueur(){
		return js.getAllJoueur();
	}
	
	@PostMapping("joueur")
	public Joueur addJoueur(@RequestBody Joueur j) {
		return js.addJoueur(j);
	}
	
	@PutMapping("joueur")
	public Joueur updateJoueur(@RequestBody Joueur j) {
		return js.updateJoueur(j);
	}
	@DeleteMapping("joueur/{id}")
	public void deleteJoueur(@PathVariable Long id) {
		js.deleteJoueur(id);
	}
	@GetMapping("equipe/{nomEquipe}/poste/{poste}")
	public List<Joueur> getJoueurByPostAndEquipe(@PathVariable String nomEquipe,@PathVariable String poste){
		return js.getJoueurByPostAndEquipe(poste, nomEquipe);
	}

}
