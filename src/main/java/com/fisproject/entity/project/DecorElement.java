package com.fisproject.entity.project;

public class DecorElement implements Project{
    @Override
    public String printProject() {
        return "Decor element";
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
    public String toString() {
        return printProject();
    }
}
