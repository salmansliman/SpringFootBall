package com.example.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="`Arbitre`")
public class Arbitre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idArbitre;
	String nom;
	String nationalite;
	@OneToMany(mappedBy = "arbitre")
	@JsonIgnore
	List <Match> matchs;
	

}
