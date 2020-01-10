package com.microservice.dao;

import com.microservice.demo.model.Employee;
import java.util.List;

public interface UserDao {

    public List<Employee> getAccountBalanceByAllUsers();
}
