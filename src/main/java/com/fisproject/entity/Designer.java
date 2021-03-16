package com.fisproject.entity;

import com.fisproject.entity.project.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
<<<<<<< HEAD
import javax.persistence.*;
=======
>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
import java.util.LinkedList;
import java.util.List;

@Component //creating spring bean
@Scope("singleton")
<<<<<<< HEAD
public class Designer  implements Actor {

    private Long id;
    protected String firstName;
    protected String lastName;
    protected int age;
=======
public class Designer extends Person implements Actor {

>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
    private List<Project> projectList=new LinkedList<>();
    @Autowired
    public Designer(@Autowired List<Project> project,@Value("${designer.firstName}") String name,@Value("${designer.lastName}") String lastName){
        this.projectList=project;
        this.lastName=lastName;
        this.firstName=name;
    }


    private Machinery newProject(){return new Machinery();}

    private LinkedList<Project> Projects(){
        LinkedList<Project> projects=new LinkedList<>();
        projects.add(new DecorElement());
        projects.add(new Furniture());
        projects.add(new Machinery());
        return projects;
    }
    public void showProject(ProjectEntity entity){
       switch (entity){
           case DECOR:{
                for(Project project:projectList){
                    if(project instanceof DecorElement){
<<<<<<< HEAD
                        //System.out.println(project.printProject());
=======
                        System.out.println(project.printProject());
>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
                    }
                }
                break;

           }
           case FURNITURE:{
               for(Project project:projectList){
                   if(project instanceof Furniture){
<<<<<<< HEAD
                      // System.out.println(project.printProject());
=======
                       System.out.println(project.printProject());
>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
                   }
               }
               break;
           }
           case MACHINERY:{
               for(Project project:projectList){
                   if(project instanceof Machinery){
<<<<<<< HEAD
                       //System.out.println(project.printProject());
=======
                       System.out.println(project.printProject());
>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
                   }
               }
                break;
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
<<<<<<< HEAD
//    @PostConstruct//apar indiferent de creaea obiectului
//    public void initMethod(){
//        System.out.println("was called init method");
//    }
//    @PreDestroy
//    public void destroyMethod(){
//        System.out.println("was called destroy method");
//    }
=======
    @PostConstruct
    public void initMethod(){
        System.out.println("was called init method");
    }
    @PreDestroy
    public void destroyMethod(){
        System.out.println("was called destroy method");
    }
>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
    @Override
    public String toString() {
        return "Designer{" +
//                "project=" + projectList +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
