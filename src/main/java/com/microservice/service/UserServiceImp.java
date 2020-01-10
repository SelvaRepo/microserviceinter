package com.microservice.service;

import com.microservice.dao.UserDao;
import com.microservice.demo.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(value = "userService")
public class UserServiceImp implements UserService {

    @Autowired
    UserDao userDao;

    public List<Employee> getAccountBalanceByAllUsers() {
        return userDao.getAccountBalanceByAllUsers();
    }

}
