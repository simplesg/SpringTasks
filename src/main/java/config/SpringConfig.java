package config;

import model.Footballer;
import model.Goalkeeper;
import model.Sportsman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    Sportsman getSportsman(){
        Sportsman sportsman = new Sportsman();
        sportsman.setFootballer(getFooballer());
        return sportsman;
    }

    @Bean
    Footballer getFooballer(){
        Footballer footballer = new Footballer();
        footballer.setGoalkeeper(getGoalkeeper());
        return footballer;
    }

    @Bean
    Goalkeeper getGoalkeeper(){
        return new Goalkeeper();
    }
}
