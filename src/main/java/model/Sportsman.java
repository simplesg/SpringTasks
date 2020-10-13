package model;

import org.springframework.stereotype.Component;

@Component
public class Sportsman {

    private Footballer footballer;

    public Sportsman(Footballer footballer) {
        this.footballer = footballer;
    }

    public Footballer getFootballer() {
        return this.footballer;
    }
}
