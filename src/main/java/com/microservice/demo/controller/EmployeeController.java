package com.microservice.demo.controller;

import com.microservice.demo.model.Employee;
import com.microservice.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class EmployeeController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/emp")
    public List<Employee> getEmployees() {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee("Selva", 1000.12));
        return employeesList;
    }

    @GetMapping(value = "/balanceAmountToAllUsers")
    public List<Employee> getAccountBalanceByAllUsers() {
        
        System.out.println("-----------------------------------------" );
        List<Employee> tasks = userService.getAccountBalanceByAllUsers();
        System.out.println("list ::" + tasks);
        System.out.println("-----------------------------------------" );
        
        return tasks;

    }    
}
