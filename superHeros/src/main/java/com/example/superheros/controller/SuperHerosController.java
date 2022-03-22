package com.example.superheros.controller;


import com.example.superheros.model.Incident;
import com.example.superheros.model.SuperHeros;

import com.example.superheros.service.IncidentService;
import com.example.superheros.service.SuperHerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

//mark class as Controller
@Controller

public class SuperHerosController {


        //autowire the BooksService class
        @Autowired
        SuperHerosService superHerosService;
        @Autowired
        IncidentService incidentService;

        //initialiser l'objet heros qui sera demandé par le formulaire
        @GetMapping("/save")
        public String herosForm(Model model) {
            //envoyer au formulaire l'objet heros initialisé, vide
            model.addAttribute("heros", new SuperHeros(){});
            //Envoyer au formualire la liste des incidents
            List<Incident> incidents = incidentService.getAllIncidents();
            model.addAttribute("incidents", incidents);
            return "superHeros/save";
        }
//Récupérer les données post et les passer en parametre dans la methode save
    @PostMapping("/SuperHeros/submitForm")
    public String submitForm(@ModelAttribute("heros") SuperHeros heros) {
       //Enregistrer le nouveau superHeros
        this.superHerosService.save(heros);

        return "home";
    }
    //méthode qui récupére l'id de l'incident signalé
    public void SendIncidentId(){

    }

}
