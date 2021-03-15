package com.fisproject;

import com.fisproject.entity.Designer;
import com.fisproject.entity.project.DecorElement;
import com.fisproject.entity.project.Project;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        DecorElement project=context.getBean("decorElement", DecorElement.class);
        System.out.println(project.printProject());
        context.close();


    }
}