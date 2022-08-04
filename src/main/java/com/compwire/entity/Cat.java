package com.compwire.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    @Autowired
    private Owner owner;
    @Value("Cat")
    private String petName;


    @Override
    public String toString() {
        return "Cat{" +
                "owner=" + owner +
                ", petName='" + petName + '\'' +
                '}';
    }

    public Cat() {
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void eat() {
        System.out.println("omnivorous");
    }

    @Override
    public void sleep() {
        System.out.println("Garden, room, balcony secret places.");
    }
}
