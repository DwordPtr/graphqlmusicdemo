package com.dwortptr.musicgraphqldemo.controller;

import com.dwortptr.musicgraphqldemo.entity.Scrobble;
import com.dwortptr.musicgraphqldemo.entity.ScrobbleId;
import com.dwortptr.musicgraphqldemo.repository.ScrobbleRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Controller
public class ScrobbleController {
    @Autowired
    private ScrobbleRepository scrobbleRepository;

    @QueryMapping(name = "findAll")
    public Collection<Scrobble> findAll(){
        System.out.println("executing findall");
        return scrobbleRepository.findAll();
    }

    @QueryMapping(name = "findById")
    public Optional<Scrobble> findById(String utcTime, String trackId){
        ScrobbleId id = new ScrobbleId(utcTime, trackId);
        return scrobbleRepository.findById(id);
    }


}
