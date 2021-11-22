package com.qa.playlist.services;

import org.springframework.stereotype.Service;

import com.qa.playlist.domain.Playlist;
import com.qa.playlist.repo.PlaylistRepo;

@Service
public class PlaylistService {
	
	private PlaylistRepo repo;
	
	public PlaylistService(PlaylistRepo repo) {
		this.repo = repo;
	}
	
	public Playlist create(Playlist playlist) {
		return this.repo.saveAndFlush(playlist);
	}

}
