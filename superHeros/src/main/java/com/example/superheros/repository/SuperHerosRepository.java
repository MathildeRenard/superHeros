package com.example.superheros.repository;

import com.example.superheros.model.SuperHeros;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SuperHerosRepository extends CrudRepository<SuperHeros, Integer>  {

    //chercher les héros en fonction de leurs incident(id)
    List<SuperHeros> findByIncidentsId(int id);

}
