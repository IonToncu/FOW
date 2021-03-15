package com.fisproject.entity.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class Furniture implements Project{
    List<String> furniture=new LinkedList<>();
    @Autowired
    public Furniture(){
        sendProjects(new String[]{
                "wardrobe ",
                "chair ",
                "table "
        });
    }
    @Override
    public String printProject() {
        StringBuilder rez= new StringBuilder();
        for(String mash:furniture){
            rez.append(mash);
        }
        return rez.toString();
    }

    @Override
    public void authorOfProject() {
        System.out.println("I'm author");
    }

    @Override
    public void printSize() {
        System.out.println("50X50X50");
    }

    @Override
    public void addProject(String name) {
        furniture.add(name);
    }

    public boolean sendProjects(String[] projects){
        if(projects.length!=0) {
            for (String pro : projects) addProject(pro);
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        return printProject();
    }
}

