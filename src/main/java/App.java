import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean2 =
                (HelloWorld) applicationContext2.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println(bean.equals(bean2));

        ApplicationContext applicationContextCat =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat =
                (Cat) applicationContextCat.getBean("cat");
        System.out.println(beanCat.getName());
        ApplicationContext applicationContextCat2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat2 =
                (Cat) applicationContextCat2.getBean("cat");
        System.out.println(beanCat2.getName());
        System.out.println(beanCat.equals(beanCat2));
    }
}