package com.fisproject.entity.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DECOR")
@Component
public class DecorElement extends Project{
    @Autowired
    public DecorElement() {
        this.name="DecorElement";
        this.description="do something";
        this.type ="Decor";
    }
    public String printProject() {
//        StringBuilder rez= new StringBuilder();
//        for(String mash:decorElements){
//            rez.append(mash+" ");
//        }
//        return rez.toString();
        return null;
    }

    public void authorOfProject() {
        System.out.println("someone");
    }
    public void printSize() {
        System.out.println("not big not small");
    }
    public boolean sendProjects(String[] projects){
        if(projects.length!=0) {
            for (String pro : projects) addProject(pro);
            return true;
        }else{
            return false;
        }
    }
    public void addProject(String name) {
       // decorElements.add(name);
    }
    @Override
    public String toString() {
        return printProject();
    }
}
