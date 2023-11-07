package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Arbitre;
import com.example.entities.Match;
import com.example.entities.Stade;
import java.util.Date;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long>{
	List<Match> findByArbitre(Arbitre a);
	List<Match> findByStade(Stade s);
	List<Match> findByDateMatch(Date date);
	void deleteByDateMatchBefore(Date date);
	
	

}
