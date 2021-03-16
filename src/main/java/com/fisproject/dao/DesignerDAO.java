package com.fisproject.dao;

import com.fisproject.entity.Designer;
import java.sql.SQLException;
import java.util.List;

public interface DesignerDAO {
    void addDesigner(Designer designer)throws SQLException;
    List<Designer> getAll()throws SQLException;
    Designer getById(long id)throws SQLException;
    void update(Designer designer)throws SQLException;
    void remove(Designer designer)throws SQLException;
}
