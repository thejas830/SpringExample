package com.example.componentscan.annotation.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// @Component - also works by creating been by converting class name into lower case
@Component("employee")
public class Employee {
    private int employeeId;

    @Value("Name")
    private String Fname;

    @Value("${java.home}")
    private String Lname;

    @Value("#{4*4}")
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
