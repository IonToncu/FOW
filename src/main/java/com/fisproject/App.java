package com.fisproject;

import com.fisproject.entity.Designer;
import com.fisproject.entity.project.*;
import com.fisproject.project.bl.SessionUtil;
import org.hibernate.Session;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        session.save(project1);
        session.save(project2);
        session.save(project3);
        sessionUtil.closeTransactionSession();
        context.close();


    }
}