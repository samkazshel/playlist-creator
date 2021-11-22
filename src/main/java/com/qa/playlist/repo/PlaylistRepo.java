package com.qa.playlist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.playlist.domain.Playlist;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, Long> {

}
