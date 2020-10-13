import config.SpringConfig;
import model.Sportsman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Sportsman sportsman = context.getBean(Sportsman.class);
        System.out.println(sportsman.getFootballer().getGoalkeeper().getName());
    }
}
