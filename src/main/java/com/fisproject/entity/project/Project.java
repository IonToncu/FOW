package com.fisproject.entity.project;

public interface Project {
    String printProject();
    void authorOfProject();
    void printSize();
    void addProject(String name);
    boolean sendProjects(String[] projects);
}
