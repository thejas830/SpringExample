package com.example.autowried.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Job {
    @Autowired
    @Qualifier("employee")
    private Employee employee;

    @Autowired
    @Qualifier("manager")
    private Manager manager;

    @Override
    public String toString() {
        return "Job{" +
                "\nemployee=" + employee +
                ",\n manager=" + manager +
                '}';
    }
}
