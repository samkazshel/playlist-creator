package com.qa.playlist.services;

import java.util.List;

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
	
	public List<Playlist> getAll(){
		return this.repo.findAll();
	}
	
	public Playlist update(Long id, Playlist playlist) {
		Playlist existing = this.repo.findById(id).get();
		existing.setPlaylistName(playlist.getPlaylistName());
		existing.setSongs(playlist.getSongs());
		return this.repo.saveAndFlush(existing);
	}
	
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		
		return !this.repo.existsById(id);
	}

}
