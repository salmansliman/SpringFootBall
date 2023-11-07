package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Equipe;
import com.example.entities.Joueur;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long>{
	List<Equipe> findByPays(String pays);

}
