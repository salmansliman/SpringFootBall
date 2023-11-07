package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Joueur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idJoueur;
	String nomJoueur;
	String poste;
	
	@ManyToOne
	Equipe equipe;

}
