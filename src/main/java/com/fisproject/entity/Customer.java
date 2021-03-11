package com.fisproject.entity;

public class Customer extends Person implements Actor{
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
}
