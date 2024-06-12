package com.dwortptr.musicgraphqldemo.repository;

import com.dwortptr.musicgraphqldemo.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, String> {
}
