package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OvertimeSalaryService {

    private final EmployeeRepository employeeRepository;
    private final HoursRepository hoursRepository;

    public OvertimeSalaryService(EmployeeRepository employeeRepository,@Qualifier("OTH") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateOvertimeSalary(){
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());
    }
}
