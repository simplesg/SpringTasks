package model;

import org.springframework.stereotype.Component;


public class Goalkeeper {
    private String name= "Messi";
    private int games = 100;

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Goalkeeper{" +
                "name='" + name + '\'' +
                ", games=" + games +
                '}';
    }
}
