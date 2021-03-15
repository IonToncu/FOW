package com.fisproject;

import com.fisproject.entity.Designer;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Project project=context.getBean("testBean", Project.class);

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