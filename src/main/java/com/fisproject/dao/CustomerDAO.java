package com.fisproject.dao;

import com.fisproject.entity.Customer;


import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO{
    void addDesigner(Customer customer)throws SQLException;
    List<Customer> getAll()throws SQLException;
    Customer getById(long id)throws SQLException;
    void update(Customer customer)throws SQLException;
    void remove(Customer customer)throws SQLException;
}
