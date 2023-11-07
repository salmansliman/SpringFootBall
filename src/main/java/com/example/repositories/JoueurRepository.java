package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Equipe;
import com.example.entities.Joueur;
@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long>{
	List<Joueur> findByEquipe(Equipe e);
	List<Joueur> findByEquipe_nomEquipe(String nomEquipe);
	List<Joueur> findByPosteAndEquipe_nomEquipe(String poste,String nomEquipe);

}
