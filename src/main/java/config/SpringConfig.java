package config;

import model.Footballer;
import model.Goalkeeper;
import model.Sportsman;
import model.Team;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "model")
public class SpringConfig {


    @Bean
    Footballer getFootballer(){
        Footballer footballer = new Footballer();
        footballer.setName("Messi");
        return footballer;
    }

    @Bean
    Sportsman getSportsman(){
        Sportsman sportsman = new Sportsman();
        sportsman.setName("Football");
        return sportsman;
    }
}
