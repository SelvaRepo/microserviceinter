package com.microservice.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="bank_customers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerEntity {

    public CustomerEntity() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "customer_first_name")
    private String customerFirstName;

    @Column(name = "customer_last_name")
    private String customerLastName;

    @Column(name = "customer_email_id")
    private String customerEmailId;

    @Column(name = "customer_mobile_no")
    private String customerMobileNo;

    @Column(name = "customer_home_address")
    private String customerHomeaddress;
    
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

    //@JsonIgnore
    //@JsonBackReference
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customerEntity")
    private List<CustomersAccountsEntity> custAccountSet = new ArrayList<CustomersAccountsEntity>(0);

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }

    public String getCustomerHomeaddress() {
        return customerHomeaddress;
    }

    public void setCustomerHomeaddress(String customerHomeaddress) {
        this.customerHomeaddress = customerHomeaddress;
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

    public List<CustomersAccountsEntity> getCustAccountSet() {
        return custAccountSet;
    }

    public void setCustAccountSet(List<CustomersAccountsEntity> custAccountSet) {
        this.custAccountSet = custAccountSet;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName=" + customerLastName + ", customerEmailId=" + customerEmailId + ", customerMobileNo=" + customerMobileNo + ", customerHomeaddress=" + customerHomeaddress + ", createUser=" + createUser + ", createDate=" + createDate + ", lastUpdateUser=" + lastUpdateUser + ", lastUpdateDate=" + lastUpdateDate + ", custAccountSet=" + custAccountSet + '}';
    }
    
    
}
