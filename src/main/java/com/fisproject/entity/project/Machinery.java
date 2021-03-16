package com.fisproject.entity.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;
@Entity
@Component
public class Machinery extends Project{
    List<String> machineryList=new LinkedList<>();
    @Autowired
    public Machinery(){
        sendProjects(new String[]{
                "machine ",
                "chisel ",
                "drill "
        });
    }
    @Override
    public String printProject() {
        StringBuilder rez= new StringBuilder();
      for(String mash:machineryList){
          rez.append(mash);
      }
      return rez.toString();
    }

    @Override
    public void authorOfProject() {

    }

    @Override
    public void printSize() {

    }

    @Override
    public void addProject(String name) {
        machineryList.add(name);
    }

    public boolean sendProjects(String[] projects){
        if(projects.length!=0) {
            for (String pro : projects) addProject(pro);
            return true;
        }else{
            return false;
        }
    }
}
