package com.udacity.jdnd.course1exercises;

import org.springframework.stereotype.Component;


@Component
public class Laptop {
    private int LapId;
    private String LapCom;

    public int getLapId() {
        return LapId;
    }

    public void setLapId(int lapId) {
        LapId = lapId;
    }

    public String getLapCom() {
        return LapCom;
    }

    public void setLapCom(String lapCom) {
        LapCom = lapCom;
    }

    public String toString(){
        return LapId+" "+LapCom;
    }
}
