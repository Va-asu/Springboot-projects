package com.udacity.jdnd.course1exercises;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aId;
    private String aName;

    @Autowired
    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String toString(){
        return "Name : "+aName+" and ID : "+aId+" with laptop "+lap.toString();
        //lap.toString will give nullPointerException if we have not assigned lap instance as AutoWired
    }
}
