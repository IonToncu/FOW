package com.fisproject.entity.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;
@Entity
@Component
public class DecorElement extends Project{
    List<String> decorElements=new LinkedList<>();
    @Autowired
    public DecorElement() {
        sendProjects(new String[]{
                "vase",
                "curtains",
                "lamp"
        });
    }

    @Override
    public String printProject() {
        StringBuilder rez= new StringBuilder();
        for(String mash:decorElements){
            rez.append(mash+" ");
        }
        return rez.toString();
    }

    @Override
    public void authorOfProject() {
        System.out.println("someone");
    }

    @Override
    public void printSize() {
        System.out.println("not big not small");
    }

    @Override
    public boolean sendProjects(String[] projects){
        if(projects.length!=0) {
            for (String pro : projects) addProject(pro);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void addProject(String name) {
        decorElements.add(name);
    }

    @Override
    public String toString() {
        return printProject();
    }
}
