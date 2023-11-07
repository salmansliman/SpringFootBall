package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Arbitre;
import com.example.entities.Match;
import com.example.entities.Stade;
import com.example.repositories.MatchRepository;
import com.example.repositories.StadeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StadeService {
	@Autowired
	StadeRepository sr;
	@Autowired
	MatchRepository mr;
	
	public List<Stade> getAllStades(){
		return sr.findAll();
	}
	
	public Stade addStade(Stade s) {
		return sr.save(s);
	}
	
	public Stade updateStade(Stade s) {
		return sr.save(s);
	}
	public List<Match> getMatchByStadeId( Long id ){
		Stade s = sr.findById(id).get();
		return mr.findByStade(s);
		
	}
	public void deleteStade(Long id) {
		List<Match> matchs= getMatchByStadeId(id);
		matchs.forEach(s->{
			s.setStade(null);
		});
		sr.deleteById(id);
	}
	public Stade getStadeByIdMatch(Long idMAtch) {
		return sr.findByMatchs_idMAtch(idMAtch);
	}

}
