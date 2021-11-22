package com.qa.playlist.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.playlist.domain.Song;
import com.qa.playlist.dto.SongWithPlaylistNameDTO;
import com.qa.playlist.services.SongService;

@RestController
@RequestMapping("/song")
public class SongController {
	
	private SongService service;
	
	public SongController(SongService service) {
		this.service = service;
	}	

	@PostMapping("/create")
	public ResponseEntity<Song> create(@RequestBody Song song){
		return new ResponseEntity<Song>(this.service.create(song), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<SongWithPlaylistNameDTO>> getAll(){
		return new ResponseEntity<List<SongWithPlaylistNameDTO>>(this.service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<SongWithPlaylistNameDTO> getById(@PathVariable Long id){
		return new ResponseEntity<SongWithPlaylistNameDTO>(this.service.getById(id), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Song> update(@PathVariable Long id, @RequestBody Song song){
		return new ResponseEntity<Song>(this.service.update(id, song), HttpStatus.ACCEPTED);
	}
	
	
}
