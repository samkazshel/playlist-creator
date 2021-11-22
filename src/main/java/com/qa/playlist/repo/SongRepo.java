package com.qa.playlist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.playlist.domain.Song;

public interface SongRepo extends JpaRepository<Song, Long>  {

}
