package com.example.superheros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.superheros.model.SuperHeros;
import com.example.superheros.repository.SuperHerosRepository;


@Service
public class SuperHerosService {

        @Autowired
       SuperHerosRepository superHerosRepository;
//Créer un nouvel heros dans la base de données.
    public void save(SuperHeros heros)
    {
        superHerosRepository.save(heros);
    }

    }



