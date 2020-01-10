package com.microservice.dao;

import com.microservice.demo.model.Employee;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.log4j.Log4j;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao")
@Transactional
@EnableTransactionManagement
@Log4j
public class UserDaoImp implements UserDao { 

    @Autowired
    private SessionFactory sessionFactory;

    public List<Employee> getAccountBalanceByAllUsers() {
        List<Employee> empList = new ArrayList<Employee>();
        
        try{
        Session session = sessionFactory.getCurrentSession();
        String selectQuery = "SELECT b.customer_first_name, SUM(ba.customer_account_balance) total FROM bank_customers b RIGHT JOIN bank_customers_accounts ba ON b.customer_id=ba.customer_id GROUP BY BA.customer_id";
        
        SQLQuery sqlQuery = session.createSQLQuery(selectQuery);
        List<Object[]> resultList = sqlQuery.list();
        
        if (resultList != null) {
            
            for (Object[] obj : resultList) {
                Employee empObj = new Employee(); 
                if(obj[0] != null){
                    empObj.setCustomerName(String.valueOf(obj[0]));
                }
                if(obj[1] != null){
                    empObj.setSalary(Double.valueOf(String.valueOf(obj[1])));
                }
                empList.add(empObj);
            }
        }
        
        System.out.println("-----------------------------------------" );
        System.out.println("empObj ::" + empList);
        System.out.println("-----------------------------------------" );
        
        }catch(Exception e ){
            System.out.println(e);
            e.printStackTrace();
        }
        return empList;
    }

}
