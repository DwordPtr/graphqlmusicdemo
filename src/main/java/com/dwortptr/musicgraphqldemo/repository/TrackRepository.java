package com.dwortptr.musicgraphqldemo.repository;

import com.dwortptr.musicgraphqldemo.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track, String> {
}
