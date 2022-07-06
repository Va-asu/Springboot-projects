package com.example.bootJPA.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

    @Id
    private int id;
    private String name;
    private String tech;

    public String getTech() {
        return tech;
    }

//    public Alien(int id,String name,String tech)
//    {
//        this.id=id;
//        this.name=name;
//        this.tech=tech;
//    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alien Id: "+id+" name: "+name+" is working on "+tech;
    }
}
