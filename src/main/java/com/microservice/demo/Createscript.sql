/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  SSundaramoorthy
 * Created: Jan 10, 2020
 */

CREATE TABLE `bank_customers` (
  `customer_id` int(25) NOT NULL AUTO_INCREMENT,
  `customer_first_name` varchar(100) DEFAULT NULL,
  `customer_last_name` varchar(100) DEFAULT NULL,
  `customer_email_id` varchar(100) DEFAULT NULL,
  `customer_mobile_no` varchar(45) DEFAULT NULL,
  `customer_home_address` varchar(1000) DEFAULT NULL,
  `create_user` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `last_update_user` varchar(45) DEFAULT NULL,
  `last_update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `c_idx` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

CREATE TABLE `bank_customers_accounts` (
  `cust_acc_id` int(25) NOT NULL AUTO_INCREMENT,
  `customer_id` int(25) NOT NULL,
  `customer_account_no` int(25) NOT NULL,
  `customer_account_balance` decimal(19,2) NOT NULL,
  `create_user` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `last_update_user` varchar(45) DEFAULT NULL,
  `last_update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`cust_acc_id`),
  KEY `ac_idx` (`cust_acc_id`),
  KEY `f-key_idx` (`customer_id`),
  CONSTRAINT `FKgacfgbbrsbxndgkau9qjmvty3` FOREIGN KEY (`customer_id`) REFERENCES `bank_customers` (`customer_id`),
  CONSTRAINT `cust_acc_fkey` FOREIGN KEY (`customer_id`) REFERENCES `bank_customers` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
