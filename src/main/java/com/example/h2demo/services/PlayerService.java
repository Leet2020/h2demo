package com.example.h2demo.services;

import com.example.h2demo.entity.Player;
import com.example.h2demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> list() {

        return playerRepository.findAll();
    }


}

