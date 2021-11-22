package com.qa.playlist.dto;

public class SongWithPlaylistNameDTO {
	//use this for song read method
	private Long id;
	private String songName;
	private String songArtist;
	private String genre;
	private String playlistName;
	
	public SongWithPlaylistNameDTO(Long id, String songName, String songArtist, String genre, String playlistName) {
		this.id = id;
		this.songName = songName;
		this.songArtist = songArtist;
		this.genre = genre;
		this.playlistName = playlistName;
	}
	
	public SongWithPlaylistNameDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongArtist() {
		return songArtist;
	}

	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}
	
	
	

}
