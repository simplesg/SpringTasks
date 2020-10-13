package config;

import model.Footballer;
import model.Goalkeeper;
import model.Sportsman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "model")
public class SpringConfig {

    @Bean
    Footballer getFooballer(){
        return new Footballer(getGoalkeeper());
    }

    @Bean
    Goalkeeper getGoalkeeper(){
        return new Goalkeeper();
    }
}
