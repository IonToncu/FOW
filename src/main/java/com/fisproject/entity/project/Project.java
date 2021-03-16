package com.fisproject.entity.project;

import javax.persistence.*;

@Entity(name="Project")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OF_PROJECT",
                     discriminatorType = DiscriminatorType.STRING )
public abstract  class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//primary key,are created to order    protected long id;
    protected long id;
    protected String name;
    protected String description;
    protected String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
//    public abstract String printProject();
//    public abstract void authorOfProject();
//    public abstract void printSize();
//    public abstract void addProject(String name);
//    public abstract boolean sendProjects(String[] projects);
}
