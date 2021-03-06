package com.fisproject.dao;

import com.fisproject.entity.Company;


import java.sql.SQLException;
import java.util.List;

public interface CompanyDAO {
    void addDesigner(Company company)throws SQLException;
    List<Company> getAll()throws SQLException;
    Company getById(long id)throws SQLException;
    void update(Company company)throws SQLException;
    void remove(Company company)throws SQLException;
}
