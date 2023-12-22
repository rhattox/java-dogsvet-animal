package com.dogsvet.animal.animalapi.controller;

import com.dogsvet.animal.animalapi.model.Animal;
import com.dogsvet.animal.animalapi.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping("/animal/register")
    public Animal registerNewAnimal(@RequestBody Animal animal) {
//        System.out.println(animal.getName() + " " + animal.getBreed()+ " " + animal.getBirthday());
        animalRepository.save(animal);
        return animal;
    }
}
