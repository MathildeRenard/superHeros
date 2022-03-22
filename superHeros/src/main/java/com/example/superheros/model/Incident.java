package com.example.superheros.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "incident")
public class Incident {

    @ManyToMany
    @JoinTable(name = "incident_heros",
            joinColumns = @JoinColumn(name = "id_incident"),
            inverseJoinColumns = @JoinColumn(name="id_heros"))
    private List<SuperHeros> superHeros = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_incident", unique = true, nullable = false)
    private int id;

    @Column(name = "nom", nullable = false)
    private String name;

    public Incident() {

    }

    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SuperHeros> getSuperHeros() {
        return superHeros;
    }

    public void setSuperHeros(List<SuperHeros> superHeros) {
        this.superHeros = superHeros;
    }
}
