package com.example.superheros.repository;

import com.example.superheros.model.SuperHeros;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SuperHerosRepository extends CrudRepository<SuperHeros, Integer>  {


}
