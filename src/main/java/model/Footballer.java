package model;

import org.springframework.stereotype.Component;

@Component
public class Footballer {
    private Goalkeeper goalkeeper;

    public Footballer(Goalkeeper goalkeeper){
        this.goalkeeper = goalkeeper;
    }

    public Goalkeeper getGoalkeeper(){
        return this.goalkeeper;
    }
}
