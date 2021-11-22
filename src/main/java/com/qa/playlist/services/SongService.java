package com.qa.playlist.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.qa.playlist.domain.Song;
import com.qa.playlist.dto.SongWithPlaylistNameDTO;
import com.qa.playlist.repo.SongRepo;

@Service
public class SongService {

	private SongRepo repo;
	
	public SongService(SongRepo repo) {
		this.repo = repo;
	}
	
	private SongWithPlaylistNameDTO mapToDTO(Song song) {
		SongWithPlaylistNameDTO dto = new SongWithPlaylistNameDTO();
		
		dto.setId(song.getId());
		dto.setSongName(song.getSongName());
		dto.setSongArtist(song.getSongArtist());
		dto.setPlaylistName(song.getPlaylist().getPlaylistName());
		return dto;
	}

	
	public Song create(Song song) {
		return this.repo.saveAndFlush(song);
	}
	
	public List<SongWithPlaylistNameDTO> getAll(){
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public SongWithPlaylistNameDTO getById(Long id) {
		Song found = this.repo.findById(id).orElseThrow(EntityNotFoundException::new);
		return mapToDTO(found);
	}
	
	public Song update (Long id, SongWithPlaylistNameDTO dto) {
		Song existing = this.repo.findById(id).get();
		existing.setSongName(dto.getSongName());
		existing.setSongArtist(dto.getSongArtist());
		existing.setGenre(dto.getGenre());
		return this.repo.saveAndFlush(existing);
	}
	
	public boolean delete (Long id) {
		this.repo.deleteById(id);
		
		return !this.repo.existsById(id);
	}
}
