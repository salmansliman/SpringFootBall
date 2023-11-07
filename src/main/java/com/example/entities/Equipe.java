package com.example.entities;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="`Equipe`")
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idEquipe;
	String nomEquipe;
	String pays;
	
	@ManyToMany(mappedBy = "equipes")
    Set<Match> matches;
	
	@OneToMany(mappedBy = "equipe")
	@JsonIgnore
	List <Joueur> joueurs;
	
}
