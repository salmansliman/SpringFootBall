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

import com.example.Services.EquipeService;
import com.example.Services.JoueurService;
import com.example.entities.Equipe;
import com.example.entities.Joueur;

@RestController
public class EquipeController {
	@Autowired
	EquipeService es;
	
	
	@GetMapping("equipe")
	public List<Equipe> getAllEquipes(){
		return es.getAllEquipes();
	}
	
	@PostMapping("equipe")
	public Equipe addEquipe(@RequestBody Equipe e) {
		return es.addEquipe(e);
	}
	@PutMapping("equipe")
	public Equipe updateEquipe(@RequestBody Equipe e) {
		return es.updateEquipe(e);
	}
	@DeleteMapping("equipe/{id}")
	public void deleteEquipe(@PathVariable Long id) {
		es.deleteEquipe(id);
	}
	@GetMapping("equipe/{pays}")
	public List <Equipe> getEquipeByPays(@PathVariable String pays){
		return es.findByPays(pays);
	}
	@GetMapping("equipe/joueurs/{nomEquipe}")
	public List <Joueur> getJoueurByEquipeNom(@PathVariable String nomEquipe){
		return es.getJoueurByEquipeNom(nomEquipe);
	}
	@GetMapping("match/equipes/{id}")
	public List<Equipe> findEquipesByMatchesId(@PathVariable Long id){
		return es.findEquipesByMatchesId(id);
	}
	
	

}
