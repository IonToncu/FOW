package com.fisproject.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "COMPANY")
@Component
@Scope("prototype")
public class Company implements Actor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "COLLABORATING_BETWEEN_COMP_AND_DES",
            joinColumns ={@JoinColumn(name = "COMPANY")},
            inverseJoinColumns ={@JoinColumn(name = "DESIGNER")}
    )
    private Set<Designer> collaboratingDesigners;
    @Override
    public void showInformation() {

    }

    @Override
    public void showDescription() {

    }
}
