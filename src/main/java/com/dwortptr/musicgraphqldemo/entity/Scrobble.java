package com.dwortptr.musicgraphqldemo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.graphql.data.method.annotation.SchemaMapping;

@Data
@Builder
@Entity
@Table(name = "scrobble")
@SchemaMapping(typeName = "Scrobble")
@IdClass(ScrobbleId.class)
public class Scrobble {
    @Id
    @Column(name = "utc_time")
    private String utcTime;

    private String uts;
    //todo replace this in model with the entities
    @JoinColumn(name = "artist_mbid")
    @ManyToOne
    private Artist artist;
    @JoinColumn(name = "album_mbid")
    @ManyToOne
    private Album album;

    @JoinColumn(name = "track_mbid")
    @OneToOne
    private Track track;

    @Id
    @Column(name = "track_mbid")
    private String trackId;
}
