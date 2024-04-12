package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.AppConfig;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.ExtraHours;
import stereotype_annotations.model.MicroService;

public class CydeoApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();

        MicroService microService = container.getBean(MicroService.class);
        microService.getTotalHours();

        ExtraHours extraHours = container.getBean(ExtraHours.class);
        System.out.println(extraHours.getHours());
    }
}
