package com.dwortptr.musicgraphqldemo;

import com.dwortptr.musicgraphqldemo.entity.Scrobble;
import com.dwortptr.musicgraphqldemo.repository.ScrobbleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class Loads {
    @Autowired
    private ScrobbleRepository repository;

    @Test
    void repoIsWorking(){
        List<Scrobble> scrobbles =
                repository.findAll();
        assertTrue(scrobbles.size() > 1);
        System.out.println(scrobbles.size());
    }
}
