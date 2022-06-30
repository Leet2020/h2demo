package com.example.h2demo;

import com.example.h2demo.entity.Player;
import com.example.h2demo.services.PlayerService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlayerServiceUnitTest {

    @Autowired
    private PlayerService playerService;
//
//    @Test
//    public void whenApplicationStarts_thenHibernateCreatesInitialRescords(){
//        List< Player> players = playerService.list();
//
//        Assert.assertEquals(players.size(), 3);
//    }


}

/*
    INSERT INTO PLAYER values (1,'USER','DESC');
    INSERT INTO PLAYER values (2,'USER2','DESC');
    INSERT INTO PLAYER values (3,'USER3','DESC');


 */