package com.dogsvet.animal.animalapi.model;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "animal_table")
public class Animal {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "name")
    private String name;
    @Column(name = "breed")
    private String breed;

    public Animal() {
    }

    public Animal(Date birthday, String name, String breed) {
        this.birthday = birthday;
        this.name = name;
        this.breed = breed;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
