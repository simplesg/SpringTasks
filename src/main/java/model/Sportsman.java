package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sportsman {

    private Footballer footballer;

    @Autowired
    public Sportsman(Footballer footballer) {
        this.footballer = footballer;
    }

    @Override
    public String toString(){
        return "Sport is " + footballer.toString();
    }
}
