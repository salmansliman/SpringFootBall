package com.example.entities;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="`Match`")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idMAtch;
	@Temporal(TemporalType.DATE)
	Date dateMatch;
	String heursMatch;
	@ManyToOne
	Arbitre arbitre;
	@ManyToOne
	Stade stade;
	@ManyToMany
	@JoinTable(name = "equipes_matchs", joinColumns = @JoinColumn(name = "match_id"), inverseJoinColumns = @JoinColumn(name = "equipe_id"))
	Set<Equipe> equipes;

}
