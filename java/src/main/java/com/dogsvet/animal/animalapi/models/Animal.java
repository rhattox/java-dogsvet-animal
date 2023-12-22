package com.dogsvet.animal.animalapi.models;

import java.util.Date;

public class Animal {
    private Date birthday;
    private String name;
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
}
