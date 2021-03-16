package com.fisproject.entity.project;

import javax.persistence.*;

@Entity
@Table(name = "DECOR_ELEMENT")
@Inheritance(strategy =  )
public abstract class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    @Column(name="NAME")
    protected String name;
    @Column(name = "DESCRIPTION")
    protected String description;
    @Column(name = "TYPE")
    protected String Type;

    public abstract String printProject();
    public abstract void authorOfProject();
    public abstract void printSize();
    public abstract void addProject(String name);
    public abstract boolean sendProjects(String[] projects);
}
