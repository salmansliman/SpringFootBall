package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Stade;
@Repository
public interface StadeRepository extends JpaRepository<Stade, Long> {
	Stade findByMatchs_idMAtch(Long idMAtch);

}
