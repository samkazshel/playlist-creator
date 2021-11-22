package com.qa.playlist.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.playlist.domain.Song;
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
	
	
}
