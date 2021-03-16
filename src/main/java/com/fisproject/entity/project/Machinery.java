package com.fisproject.entity.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;
@Entity
@DiscriminatorValue("Machinery")
@Component
public class Machinery extends Project{
    //List<String> machineryList=new LinkedList<>();
    @Autowired
    public Machinery(){
<<<<<<< HEAD
      this.name="machinery";
      this.description="do something";
      this.Type="Machinery";
=======
        sendProjects(new String[]{
                "machine ",
                "chisel ",
                "drill "
        });
>>>>>>> 1edee968b135b4a2807f29d86af832ce21a9ce17
    }
    public String printProject() {
//        StringBuilder rez= new StringBuilder();
//      for(String mash:machineryList){
//          rez.append(mash);
//      }
//      return rez.toString();
        return null;
    }

    public void authorOfProject() {

    }
    public void printSize() {

    }
    public void addProject(String name) {
       // machineryList.add(name);
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
