package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Joueur;
import com.example.repositories.JoueurRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class JoueurService {
	@Autowired
	JoueurRepository jr;
	
	public List <Joueur> getAllJoueur(){
		return jr.findAll();
	}
	
	public Joueur addJoueur(Joueur j) {
		return jr.save(j);
	}
	public Joueur updateJoueur(Joueur j) {
		return jr.save(j);
	}
	public void deleteJoueur(Long id) {
		 jr.deleteById(id);
	}
	public List<Joueur> getJoueurByPostAndEquipe(String poste,String nomEquipe){
		return jr.findByPosteAndEquipe_nomEquipe(poste, nomEquipe);
	}
}
