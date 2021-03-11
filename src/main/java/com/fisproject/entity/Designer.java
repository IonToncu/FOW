package com.fisproject.entity;

import com.fisproject.entity.project.Project;

public class Designer extends Person implements Actor {
    private  Project project;
    public Designer(Project project){
        this.project=project;
    }
    public Designer(String name,Project project){
        this.project=project;
        this.firstName=name;
    }
    public Designer(String[] name,Project project){
        this.project=project;
        this.firstName=name[0];
        this.lastName=name[1];
    }
    public void showProject(){
        System.out.println(project);
        project.authorOfProject();
        project.printSize();
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
                "project=" + project +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
