package com.fisproject;

import com.fisproject.entity.Designer;
import com.fisproject.entity.project.Project;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author IonTsonku
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Project project=context.getBean("testBean", Project.class);

        /**
         * inversion of control
         *  IOC
         * */
        Designer designer = context.getBean("designer", Designer.class);
        designer.showProject();
        System.out.println(designer);
        designer.setFirstName("Vasea");// here was used singleton b
        Designer designer1 = context.getBean("designer", Designer.class);
        designer.showProject();
        System.out.println(designer);
        context.close();
        String string = new String("ceva");
        System.out.println(string);
    }
}