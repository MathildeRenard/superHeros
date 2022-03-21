package com.example.superheros.controller;

import java.util.List;

import com.example.superheros.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Controller;
import com.example.superheros.model.Incident;

//mark class as Controller
@Controller
public class IncidentController {

        //autowire the BooksService class
        @Autowired
        IncidentService incidentService;
        //creating a get mapping that retrieves all the books detail from the database
        @GetMapping("/incidents")
        private String getAllIncidents(Model model)
        {
                List<Incident> incidents = incidentService.getAllIncidents();
                model.addAttribute("incidents", incidents);
                return  "incident/index";
        }

}
