package com.dwortptr.musicgraphqldemo.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "artist")
public class Artist {
    @Column(name = "artist")
    private String artistName;
    @Id
    @Column(name = "artist_mbid")
    private String artistId;
}
