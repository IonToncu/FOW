package com.fisproject.entityservice;
import com.fisproject.dao.CompanyDAO;
import com.fisproject.entity.Company;
import com.fisproject.project.bl.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.sql.SQLException;
import java.util.List;

public class CompanyService extends SessionUtil implements CompanyDAO {
    @Override
    public void addDesigner(Company company) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.save(company);
        closeTransactionSession();

    }

    @Override
    public List<Company> getAll() throws SQLException {
        openTransactionSession();
        String sql="SELECT * FROM PROJECT";
        Session session=getSession();
        Query query =session.createNativeQuery(sql).addEntity(Company.class);
        List<Company> designerList=query.list();
        closeTransactionSession();
        return designerList;
    }

    @Override
    public Company getById(long id) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        String sql="SELECT * FROM PROJECT WHERE ID =:id";
        Query query=session.createNativeQuery(sql).addEntity(Company.class);
        query.setParameter("id",id);
        Company company=(Company)query.getSingleResult();
        closeTransactionSession();
        return company;
    }

    @Override
    public void update(Company company) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.update(company);
        closeTransactionSession();
    }

    @Override
    public void remove(Company company) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.remove(company);
        closeTransactionSession();
    }
}
