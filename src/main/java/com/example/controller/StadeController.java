package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.StadeService;
import com.example.entities.Stade;

@RestController
public class StadeController {
	@Autowired
	StadeService ss;
	
	@GetMapping("stade")
	public List<Stade> getAllStades(){
		return ss.getAllStades();
	}
	
	@PostMapping("stade")
	public Stade addStade(@RequestBody Stade s) {
		return ss.addStade(s);
	}
	
	@PutMapping("stade")
	public Stade updateStade(@RequestBody Stade s) {
		return ss.updateStade(s);
	}
	@DeleteMapping("stade/{id}")
	public void deleteStade(@PathVariable Long id) {
		ss.deleteStade(id);
	}
	@GetMapping("stade/match/{idMAtch}")
	public Stade getStadeByMatchId(@PathVariable Long idMAtch) {
		return ss.getStadeByIdMatch(idMAtch);
	}

}
