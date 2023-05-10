package com.devsuperior.dslist.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> listaGames() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	
	@GetMapping("/{id}")
	public GameDTO findById(@PathVariable("id") Long id) {
		GameDTO result = gameService.findById(id);
		return result;
	}

}
