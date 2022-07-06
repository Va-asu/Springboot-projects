package com.udacity.jdnd.course1exercises;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Spaceship {
    private int spaceShipNo;
    private String spaceShipPilotName;

    public int getSpaceShipNo() {
        return spaceShipNo;
    }

    public void setSpaceShipNo(int spaceShipNo) {
        this.spaceShipNo = spaceShipNo;
    }

    public String getSpaceShipPilotName() {
        return spaceShipPilotName;
    }

    public void setSpaceShipPilotName(String spaceShipPilotName) {
        this.spaceShipPilotName = spaceShipPilotName;
    }

    public String toString(){
        return "Spaceship No."+spaceShipNo+" has pilot named "+spaceShipPilotName;
    }
}
