package com.fisproject.entity;

import com.fisproject.entity.project.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component //creating spring bean
public class Designer extends Person implements Actor {
    private List<Project> projectList=new LinkedList<>();

    public Designer(LinkedList<Project> project){
        this.projectList=project;
    }
    public Designer(){}
    private void initMethod(){
        System.out.println("<<was called init method>>");
    }

    public void showProject(ProjectEntity entity){
       switch (entity){
           case DECOR:{
                for(Project project:projectList){
                    if(project instanceof DecorElement){
                        project.printProject();
                    }
                }
           }
           case FURNITURE:{
               for(Project project:projectList){
                   if(project instanceof Furniture){
                       project.printProject();
                   }
               }
           }
           case MACHINERY:{
               for(Project project:projectList){
                   if(project instanceof Machinery){
                       project.printProject();
                   }
               }

           }
           default:System.out.println("Doesn't exist");
       }
    }

    @Override
    public void showInformation() {

    }
    @Override
    public void showDescription() {
        System.out.println("Designer:" +
                "actor which can add or delete own project" +
                "when he post his project he can also see" +
                "how saw his project,also he can collaborate" +
                "with companies,collaborating companies posts the" +
                "designers and their projects,and if customer chose" +
                "this product from company he receives a discounts");
    }

    @Override
    public String toString() {
        return "Designer{" +
//                "project=" + projectList +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
