package com.fisproject.entity;

import com.fisproject.entity.project.Project;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="CUSTOMER")
@Component //creating spring bean
@Scope("singleton")
public class Customer  implements Actor{
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    protected String firstName;
    protected String lastName;
    protected int age;
    @Column(name ="LIKED_PROJECT")
    @OneToMany()
    private Set<Project>likedProjects;
    public Set<Project> getLikedProjects() {
        return likedProjects;
    }

    public void setLikedProjects(Set<Project> likedProjects) {
        this.likedProjects = likedProjects;
    }



    @Override
    public void showInformation() {

    }

    @Override
    public void showDescription() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
