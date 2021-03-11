package com.fisproject.entity.project;

public class Furniture implements Project{
    @Override
    public String printProject() {
        return "Furniture";
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
    public String toString() {
        return printProject();
    }
}
