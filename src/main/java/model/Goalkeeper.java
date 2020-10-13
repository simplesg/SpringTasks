package model;

import org.springframework.stereotype.Component;

@Component
public class Goalkeeper {
    private String name= "Messi";
    private int games = 100;

    public String getName() {
        return this.name;
    }
}
