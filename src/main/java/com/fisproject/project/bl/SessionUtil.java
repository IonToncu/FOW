package com.fisproject.project.bl;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SessionUtil {
    private Session session;
    private Transaction transaction;

    public Session getSession() {
        return session;
    }

    private Transaction getTransaction() {
        return transaction;
    }
    private Session openSession(){
        return HibernateUtil.getSessionFactory().openSession();
    }
    public Session openTransactionSession(){
        session=openSession();
        transaction=session.beginTransaction();
        return session;
    }
    private void closeSession(){
        session.close();
    }
    public void closeTransactionSession(){
        transaction.commit();
        closeSession();
    }
}