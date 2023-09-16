package app.config;

import app.model.*;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name="dog")
    @Scope("prototype")
    public Dog getDog() {
        Dog dog = new Dog();
        return dog;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        return cat;
    }
    @Bean(name="timer")
    @Scope("prototype")
    public Timer getTime() {
        Timer timer = new Timer();
        return timer;
    }
}