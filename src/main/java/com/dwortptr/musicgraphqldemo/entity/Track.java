package com.dwortptr.musicgraphqldemo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "track")
public class Track {
    @Column(name = "track")
    private String trackName;

    @Id
    @Column(name = "track_mbid")
    private String trackId;
}
