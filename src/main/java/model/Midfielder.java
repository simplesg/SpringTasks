package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Midfielder")
public class Midfielder implements Team {
    private final Footballer footballer;

    @Autowired
    public Midfielder(Footballer footballer){
        this.footballer = footballer;
    }

    public Footballer getFootballer() {
        return this.footballer;
    }

    @Override
    public String toString() {
        int goals = 100;
        return "Midfielder{" +
                "name='" + footballer + '\'' +
                ", goals=" + goals +
                '}';
    }
}
