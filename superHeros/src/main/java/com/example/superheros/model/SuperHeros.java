package com.example.superheros.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "super_heros")
public class SuperHeros {

    @ManyToMany
    @JoinTable(name = "incident_heros",
    joinColumns = @JoinColumn(name = "id_heros"),
    inverseJoinColumns = @JoinColumn(name="id_incident"))
    private List<Incident> incidents = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_heros", unique = true, nullable = false)
    private int id;

    @Column(name = "nom", nullable = false)
    private String name;

    @Column(name = "localisation", nullable = false)
    private String location;

    @Column(name = "telephone", nullable = false)
    private int phone;

    public SuperHeros() {

    }

    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getPhone() {
        return phone;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
    }

    public List<Incident> getIncidents() {
        return incidents;
    }
}
