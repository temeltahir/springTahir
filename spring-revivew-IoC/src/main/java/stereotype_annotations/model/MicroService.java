package stereotype_annotations.model;

import org.springframework.stereotype.Component;

@Component
public class MicroService {

    public void getTotalHours(){
        System.out.println("Total Hours: "+ 20);
    }
}
