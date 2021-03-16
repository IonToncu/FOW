package com.fisproject;

import com.fisproject.entity.Designer;
import com.fisproject.entity.project.DecorElement;
import com.fisproject.entity.project.Project;
import com.fisproject.entity.project.ProjectEntity;
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

        Designer designer=context.getBean("designer", Designer.class);
        designer.showProject(FURNITURE);
        designer.showProject(DECOR);
        System.out.println(designer);
        context.close();


    }
}