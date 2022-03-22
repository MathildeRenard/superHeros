package com.example.superheros.service;

import com.example.superheros.model.Incident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import com.example.superheros.model.SuperHeros;
import com.example.superheros.repository.SuperHerosRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class SuperHerosService {

    public List<SuperHeros> getAllSuperHeros()
    {

        List<SuperHeros> superHeros = new ArrayList<SuperHeros>();
        superHerosRepository.findAll().forEach(superHeros1 -> superHeros.add(superHeros1));
        return superHeros;
    }

        @Autowired
       SuperHerosRepository superHerosRepository;
//Créer un nouveau heros dans la base de données.
    public void save(SuperHeros heros)
    {
        superHerosRepository.save(heros);
    }


}



