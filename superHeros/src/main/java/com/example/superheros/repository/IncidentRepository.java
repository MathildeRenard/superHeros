package com.example.superheros.repository;

import com.example.superheros.model.Incident;
import org.springframework.data.repository.CrudRepository;

public interface IncidentRepository extends CrudRepository<Incident, Integer> {
}
