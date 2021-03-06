package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Goalkeeper")
public class Goalkeeper implements Team{
    private final Footballer footballer;

    @Autowired
    public Goalkeeper(Footballer footballer){
        this.footballer = footballer;
    }

    @Override
    public Footballer getFootballer() {
        return this.footballer;
    }

    @Override
    public String toString() {
        int saves = 100;
        return "Goalkeeper{" +
                "name='" + footballer + '\'' +
                ", saves=" + saves +
                '}';
    }
}
