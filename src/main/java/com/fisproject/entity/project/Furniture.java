package com.fisproject.entity.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;
@Entity
@DiscriminatorValue("Furniture")
@Component
public class Furniture extends Project{
//    List<String> furniture=new LinkedList<>();
    @Autowired
    public Furniture(){

        this.name="Furniture";
        this.description="do something";
        this.Type="Furniture";

        sendProjects(new String[]{
                "wardrobe ",
                "chair ",
                "table "
        });

    }
    public String printProject() {
//        StringBuilder rez= new StringBuilder();
//        for(String mash:furniture){
//            rez.append(mash);
//        }
//        return rez.toString();
        return null;
    }


    public void authorOfProject() {
        System.out.println("I'm author");
    }
    public void printSize() {
        System.out.println("50X50X50");
    }
    public void addProject(String name) {
        //furniture.add(name);
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
        return "Furniture{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}

