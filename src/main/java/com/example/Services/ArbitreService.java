package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Arbitre;
import com.example.entities.Match;
import com.example.repositories.ArbitreRepository;
import com.example.repositories.MatchRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class ArbitreService {
	@Autowired
	ArbitreRepository ar;
	@Autowired
	MatchRepository mr;
	
	public List<Arbitre> getAllArbitres(){
		return ar.findAll();
	}
	
	public Arbitre addArbitre(Arbitre a) {
		return ar.save(a);
	}
	public Arbitre updateArbitre(Arbitre a) {
		return ar.save(a);
	}
	public List<Match> getMatchByArbitreId( Long id ){
		Arbitre a = ar.findById(id).get();
		return mr.findByArbitre(a);
		
	}
	public void deleteArbitre(Long id) {
		List<Match> matchs= getMatchByArbitreId(id);
		matchs.forEach(s->{
			s.setArbitre(null);
		});
		ar.deleteById(id);
		
		
		
	}
	

}
