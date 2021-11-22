package com.qa.playlist.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Playlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long playlistID;
	
	@Column
	private String playlistName;
	
	@JsonIgnore
	@OneToMany(mappedBy="song")
	private List<Song> songs;

}
