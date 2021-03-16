package com.fisproject.entityservice;

import com.fisproject.dao.DesignerDAO;
import com.fisproject.entity.Designer;
import com.fisproject.entity.project.Project;
import com.fisproject.project.bl.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class DesignerService extends SessionUtil implements DesignerDAO {

    @Override
    public void addDesigner(Designer project) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.save(project);
        closeTransactionSession();
    }

    @Override
    public List<Designer> getAll() throws SQLException {
        openTransactionSession();
        String sql="SELECT * FROM PROJECT";
        Session session=getSession();
        Query query =session.createNativeQuery(sql).addEntity(Designer.class);
        List<Designer> designerList=query.list();
        closeTransactionSession();
        return designerList;
    }

    @Override
    public Designer getById(long id) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        String sql="SELECT * FROM PROJECT WHERE ID =:id";
        Query query=session.createNativeQuery(sql).addEntity(Designer.class);
        query.setParameter("id",id);
        Designer designer=(Designer)query.getSingleResult();
        closeTransactionSession();
        return designer;
    }

    @Override
    public void update(Designer designer) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.update(designer);
        closeTransactionSession();
    }

    @Override
    public void remove(Designer designer) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.remove(designer);
        closeTransactionSession();
    }
}
