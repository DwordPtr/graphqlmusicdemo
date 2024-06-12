package com.dwortptr.musicgraphqldemo.repository;

import com.dwortptr.musicgraphqldemo.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, String> {
}
