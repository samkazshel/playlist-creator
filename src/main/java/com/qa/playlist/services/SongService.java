package com.qa.playlist.services;

import org.springframework.stereotype.Service;

import com.qa.playlist.domain.Song;
import com.qa.playlist.repo.SongRepo;

@Service
public class SongService {

	private SongRepo repo;
	
	public SongService(SongRepo repo) {
		this.repo = repo;
	}
	
	public Song create(Song song) {
		return this.repo.saveAndFlush(song);
	}
}
