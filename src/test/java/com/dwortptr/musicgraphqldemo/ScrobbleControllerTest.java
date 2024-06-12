package com.dwortptr.musicgraphqldemo;

import com.dwortptr.musicgraphqldemo.controller.ScrobbleController;
import com.dwortptr.musicgraphqldemo.entity.Scrobble;
import com.dwortptr.musicgraphqldemo.repository.ScrobbleRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.graphql.test.tester.GraphQlTester;

@Disabled
@GraphQlTest(ScrobbleController.class)
public class ScrobbleControllerTest {
    @Autowired
    private GraphQlTester tester;


    @Test
    void returnsSomething(){
        GraphQlTester.EntityList<Scrobble> scrobbles = tester.document("schema")
                .execute()
                .path("findAll")
                .entityList(Scrobble.class);
        scrobbles.hasSizeGreaterThan(5);
    }
}
