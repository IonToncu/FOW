package com.fisproject.entityservice;

import com.fisproject.dao.ProjectDAO;
import com.fisproject.entity.project.Project;
import com.fisproject.project.bl.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class ProjectService extends SessionUtil implements ProjectDAO {

    @Override
    public void addProject(Project project) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.save(project);
        closeTransactionSession();
    }

    @Override
    public List<Project> getAll() throws SQLException {
        openTransactionSession();
        String sql="SELECT * FROM PROJECT";
        Session session=getSession();
        Query query =session.createNativeQuery(sql).addEntity(Project.class);
        List<Project> projectList=query.list();
        closeTransactionSession();
        return projectList;
    }

    @Override
    public Project getById(long id) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        String sql="SELECT * FROM PROJECT WHERE ID =:id";
        Query query=session.createNativeQuery(sql).addEntity(Project.class);
        query.setParameter("id",id);
        Project project=(Project)query.getSingleResult();
        closeTransactionSession();
        return project;
    }

    @Override
    public void update(Project project) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.update(project);
        closeTransactionSession();
    }

    @Override
    public void remove(Project project) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.remove(project);
        closeTransactionSession();
    }
}
