package com.dwortptr.musicgraphqldemo.repository;

import com.dwortptr.musicgraphqldemo.entity.Scrobble;
import com.dwortptr.musicgraphqldemo.entity.ScrobbleId;
import jakarta.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScrobbleRepository extends JpaRepository<Scrobble, ScrobbleId> {
}
