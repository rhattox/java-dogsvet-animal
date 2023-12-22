package com.dogsvet.animal.animalapi.controller;

import com.dogsvet.animal.animalapi.model.Animal;
import com.dogsvet.animal.animalapi.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping("/animal/register")
    public Animal registerNewAnimal(@RequestBody Animal animal) {

        animalRepository.save(animal);
        return animal;
    }
}
