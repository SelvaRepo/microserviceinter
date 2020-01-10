/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author SSundaramoorthy
 */
@Entity
@Table(name = "bank_customers_accounts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomersAccountsEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "cust_acc_id")
    private long custAccId;    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    @JsonBackReference
    private CustomerEntity customerEntity;    
    
    @Column(name = "customer_account_no")
    private String accountNo;
    
    @Column(name = "customer_account_balance")
    private String accountBalance;    
    
    @Column(name = "create_user", length = 45)
    private String createUser="SYS_USER";

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", length = 19)
    private Date createDate = new Date();

    @Column(name = "last_update_user", length = 45)
    private String lastUpdateUser="SYS_USER";

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update_date", length = 19)
    private Date lastUpdateDate = new Date();   

    public long getCustAccId() {
        return custAccId;
    }

    public void setCustAccId(long custAccId) {
        this.custAccId = custAccId;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "CustomersAccountsEntity{" + "custAccId=" + custAccId + ", customerEntity=" + customerEntity + ", accountNo=" + accountNo + ", accountBalance=" + accountBalance + ", createUser=" + createUser + ", createDate=" + createDate + ", lastUpdateUser=" + lastUpdateUser + ", lastUpdateDate=" + lastUpdateDate + '}';
    }
    
    
}
