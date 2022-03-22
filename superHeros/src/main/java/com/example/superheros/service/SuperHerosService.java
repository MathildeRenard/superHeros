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
//Créer un nouvel heros dans la base de données.
    public void save(SuperHeros heros)
    {
        superHerosRepository.save(heros);
    }


    //recuperer les héros en focntion de l'id de leur incidents(cette methode est reliée à celle du superHerosRepository
    public List<SuperHeros>  findByIncidentsId(int id){
    List<SuperHeros> heros= new ArrayList<>();
    heros = superHerosRepository.findByIncidentsId(id);
    return heros;
    }
}



