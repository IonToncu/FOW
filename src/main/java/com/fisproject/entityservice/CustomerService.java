package com.fisproject.entityservice;

import com.fisproject.dao.CustomerDAO;
import com.fisproject.entity.Customer;
import com.fisproject.entity.Customer;
import com.fisproject.project.bl.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class CustomerService extends SessionUtil implements CustomerDAO {
    @Override
    public void addDesigner(Customer customer) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.save(customer);
        closeTransactionSession();
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        openTransactionSession();
        String sql="SELECT * FROM PROJECT";
        Session session=getSession();
        Query query =session.createNativeQuery(sql).addEntity(Customer.class);
        List<Customer> designerList=query.list();
        closeTransactionSession();
        return designerList;
    }

    @Override
    public Customer getById(long id) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        String sql="SELECT * FROM PROJECT WHERE ID =:id";
        Query query=session.createNativeQuery(sql).addEntity(Customer.class);
        query.setParameter("id",id);
        Customer customer=(Customer)query.getSingleResult();
        closeTransactionSession();
        return customer;
    }

    @Override
    public void update(Customer customer) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.update(customer);
        closeTransactionSession();
    }

    @Override
    public void remove(Customer customer) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.remove(customer);
        closeTransactionSession();
    }
}
