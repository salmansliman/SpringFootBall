package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entities.Equipe;
import com.example.entities.Joueur;

import com.example.repositories.EquipeRepository;
import com.example.repositories.JoueurRepository;


@Service
public class EquipeService {
	@Autowired
	EquipeRepository er;
	@Autowired
	JoueurRepository jr;
	
	public List<Equipe> getAllEquipes(){
		return er.findAll();
	}
	public Equipe addEquipe(Equipe e) {
		return er.save(e);
	}
	public Equipe updateEquipe(Equipe e) {
		return er.save(e);
	}
	public List<Joueur> getJoueurByEquipeId( Long id ){
		Equipe e = er.findById(id).get();
		return jr.findByEquipe(e);
		
	}
	public void deleteEquipe(Long id) {
		List<Joueur> joueur= getJoueurByEquipeId(id);
		joueur.forEach(s->{
			s.setEquipe(null);
		});
		er.deleteById(id);
	}
	public List<Equipe> findByPays(String pays){
		return er.findByPays(pays);
	}
	public List<Joueur> getJoueurByEquipeNom(String nomEquipe){
		return jr.findByEquipe_nomEquipe(nomEquipe);
	}
}
