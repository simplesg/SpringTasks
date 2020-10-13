package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Footballer {
    private Goalkeeper goalkeeper;

    @Autowired
    public Footballer(Goalkeeper goalkeeper){
        this.goalkeeper = goalkeeper;
    }


    @Override
    public String toString(){
        return "Football : " + goalkeeper.toString();
    }
}
