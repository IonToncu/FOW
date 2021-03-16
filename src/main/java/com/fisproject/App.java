package com.fisproject;

import com.fisproject.entity.Designer;
<<<<<<< HEAD
import com.fisproject.entity.project.*;
import com.fisproject.project.bl.SessionUtil;
import org.hibernate.Session;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
=======
import com.fisproject.entity.project.DecorElement;
import com.fisproject.entity.project.Project;
import com.fisproject.entity.project.ProjectEntity;
>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.fisproject.entity.project.ProjectEntity.DECOR;
import static com.fisproject.entity.project.ProjectEntity.FURNITURE;

/**
 * @author IonTsonku
 */
public class App {
    public static void main(String[] args) {

<<<<<<< HEAD
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
=======
//
//        Designer designer=context.getBean("designer",Designer.class);
//        System.out.println(designer);
        Designer designer=context.getBean("designer", Designer.class);
        designer.showProject(FURNITURE);
        designer.showProject(DECOR);
        System.out.println(designer);
>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
        context.close();


    }
}