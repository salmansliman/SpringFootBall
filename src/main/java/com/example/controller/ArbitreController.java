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

import com.example.Services.ArbitreService;
import com.example.entities.Arbitre;

@RestController
public class ArbitreController {
	@Autowired
	ArbitreService as;
	
	@GetMapping("arbitre")
	public List<Arbitre> getAllArbitres(){
		return as.getAllArbitres();
	}
	@PostMapping("arbitre")
	public Arbitre addArbitre(@RequestBody Arbitre a) {
		return as.addArbitre(a);
	}
	@PutMapping("arbitre")
	public Arbitre updateArbitre(@RequestBody Arbitre a) {
		return as.updateArbitre(a);
	}
	@DeleteMapping("arbitre/{id}")
	public void deleteArbitre(@PathVariable Long id) {
		as.deleteArbitre(id);
	}

}
