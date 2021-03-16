package com.fisproject;

import com.fisproject.entity.Company;
import com.fisproject.entity.Customer;
import com.fisproject.entity.Designer;
import com.fisproject.entity.project.*;
import com.fisproject.project.bl.SessionUtil;
import org.hibernate.Session;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fisproject.entity.project.DecorElement;
import com.fisproject.entity.project.Project;
import com.fisproject.entity.project.ProjectEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.fisproject.entity.project.ProjectEntity.DECOR;
import static com.fisproject.entity.project.ProjectEntity.FURNITURE;

/**
 * @author IonTsonku
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

       // Designer designer=context.getBean("designer", Designer.class);
        //designer.showProject(FURNITURE);
        //designer.showProject(DECOR);
       // System.out.println(designer);
        SessionUtil sessionUtil=new SessionUtil();
        sessionUtil.openTransactionSession();
        Session session= sessionUtil.getSession();
        Project project1=context.getBean("furniture", Furniture.class);
        Project project2=context.getBean("machinery", Machinery.class);
        Project project3=context.getBean("decorElement", DecorElement.class);
        Designer designer1=context.getBean("designer",Designer.class);
        Company company1=context.getBean("company",Company.class);
        Customer customer=context.getBean("customer",Customer.class);

        session.save(designer1);
        session.save(project1);
        session.save(project2);
        session.save(project3);
        session.save(company1);
        session.save(customer);
        sessionUtil.closeTransactionSession();

//
//        Designer designer=context.getBean("designer",Designer.class);
//        System.out.println(designer);
        Designer designer=context.getBean("designer", Designer.class);
        designer.showProject(FURNITURE);
        designer.showProject(DECOR);
        System.out.println(designer);

        context.close();


    }
}