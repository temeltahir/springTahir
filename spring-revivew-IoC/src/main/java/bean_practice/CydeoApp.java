package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {
        //how to create a spring container ?
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class,AnotherAppConfig.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        fullTimeEmployee.createAccount();

        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);
        partTimeEmployee.createAccount();

        String str1 = container.getBean("String Welcome",String.class);
        System.out.println(str1);


    }
}
