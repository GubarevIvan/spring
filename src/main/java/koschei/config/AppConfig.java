package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
    @Bean(name = "ocean")
    public static Ocean1 getOcean() {
        return new Ocean1();
    }

    @Bean(name = "island")
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean(name = "wood")
    public static Wood3 getWood(Rabbit4 rabbit) {
        return new Wood3(rabbit);
    }

    @Bean(name = "rabbit")
    public static Rabbit4 getRabbit(Duck5 duck) {
        return new Rabbit4(duck);
    }
    @Bean(name = "duck")
    public static Duck5 getDuck() {
        return new Duck5();
    }

    @Bean(name = "egg")
    public static Egg6 getEgg() {
        Egg6 egg = new Egg6(getNeedle());
        return egg;
    }

    @Bean(name = "needle")
    public static Needle7 getNeedle() {
        Needle7 needle = new Needle7();
        return needle;
    }

    @Bean(name = "deth")
    public static Deth8 getDeth() {
        Deth8 deth = new Deth8();
        return deth;
    }
}
