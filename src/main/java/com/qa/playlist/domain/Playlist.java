package com.qa.playlist.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Playlist {
	@Id
	@GeneratedValue
	private Long playlistID;

}
