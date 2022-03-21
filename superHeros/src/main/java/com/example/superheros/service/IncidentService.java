package com.example.superheros.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.superheros.model.Incident;
import com.example.superheros.repository.IncidentRepository;
//defining the business logic
@Service
public class IncidentService {

        @Autowired
        IncidentRepository incidentRepository;
        //récupérer tous les incidents de la base de données
        public List<Incident> getAllIncidents()
        {
            List<Incident> incidents = new ArrayList<Incident>();
            incidentRepository.findAll().forEach(incident1 -> incidents.add(incident1));
            return incidents;
        }


}
