package com.dwortptr.musicgraphqldemo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "album")
public class Album {
    @Column(name = "album")
    private String albumName;
    @Id
    @Column(name = "album_mbid")
    private String albumId;
}
