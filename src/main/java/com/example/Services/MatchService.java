package com.example.Services;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Match;
import com.example.repositories.MatchRepository;

@Service
public class MatchService {
	@Autowired
	MatchRepository mr;
	
	
	public List<Match> getAllMatchs(){
		 return mr.findAll();
	}
	public Match addMatch(Match m) {
		return mr.save(m);
		
	}
	public Match updateMatch(Match m) {
		return mr.save(m);
	}
	public void deleteMatch(Long id) {
		mr.deleteById(id);
	}
	public List<Match> getMatchByDateMatch(Date date){
		return mr.findByDateMatch(date);
	}
	public void deleteMatchDepasse() {
		Date date = Calendar.getInstance().getTime();
		mr.deleteByDateMatchBefore(date);
	}


}
