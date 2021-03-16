package com.fisproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "COMPANY")
public class Company implements Actor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Override
    public void showInformation() {

    }

    @Override
    public void showDescription() {

    }
}
