package com.microservice.service;

import com.microservice.demo.model.Employee;
import java.util.List;

public interface UserService {

    public List<Employee> getAccountBalanceByAllUsers();
}
