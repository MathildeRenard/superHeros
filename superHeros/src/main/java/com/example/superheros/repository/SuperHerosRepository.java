package com.example.superheros.repository;

import com.example.superheros.model.SuperHeros;
import org.springframework.data.repository.CrudRepository;

public interface SuperHerosRepository extends CrudRepository<SuperHeros, Integer>  {
}
