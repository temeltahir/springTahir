package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //we need methods that are returning our FullTime and PartTime objects
    @Bean
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean
    public PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
}
