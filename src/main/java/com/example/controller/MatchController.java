package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.MatchService;
import com.example.entities.Match;

@RestController
public class MatchController {
	@Autowired
	MatchService ms;
	@GetMapping("match")
	public List<Match> getAllMAtch(){
		return ms.getAllMatchs();
	}
	@PostMapping("match")
	public Match AddMatch(@RequestBody Match m) {
		return ms.addMatch(m);
	}
	@PutMapping ("match")
	public Match updateMatch(@RequestBody Match m) {
		return ms.updateMatch(m);
	}
	@DeleteMapping("match/{id}")
	public void deleteMatch(@PathVariable Long id) {
		ms.deleteMatch(id);
	}
	@GetMapping("match/{date}")
	public List<Match> getMatchByDateMatch(@PathVariable Date date){
		
		List<Match> matchs = ms.getMatchByDateMatch(date);
		matchs.forEach(s->{
			System.out.println(s.getDateMatch());
			
		});
		return ms.getMatchByDateMatch(date);
	}
	@DeleteMapping("match")
	public void deleteMatchDepasse() {
		ms.deleteMatchDepasse();
	}
}
