package com.microservice.demo.model;


public class Employee {
    
    private String customerName;
    private Double salary;

    public Employee() {
    }

    public Employee(String customerName, Double salary) {
        this.customerName = customerName;
        this.salary = salary;
    }

    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "customerName=" + customerName + ", salary=" + salary + '}';
    }
    
    
}
