package com.qa.playlist.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.playlist.domain.Playlist;
import com.qa.playlist.services.PlaylistService;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {
	
	private PlaylistService service;
	
	public PlaylistController(PlaylistService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Playlist> create(@RequestBody Playlist playlist){
		return new ResponseEntity<Playlist>(this.service.create(playlist), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Playlist>> getAll(){
		return new ResponseEntity<List<Playlist>>(this.service.getAll(), HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Playlist> delete(@PathVariable Long id){
		return this.service.delete(id) ? new ResponseEntity<Playlist>(HttpStatus.NO_CONTENT)
				:new ResponseEntity<Playlist>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
