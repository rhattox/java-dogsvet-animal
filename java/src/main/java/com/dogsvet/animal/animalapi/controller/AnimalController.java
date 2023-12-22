package com.dogsvet.animal.animalapi.controller;

import com.dogsvet.animal.animalapi.model.Animal;
import com.dogsvet.animal.animalapi.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping("/animal/register")
    public Animal registerNewAnimal(@RequestBody Animal animal) {
        animalRepository.save(animal);
        return animal;
    }

    @GetMapping("/animal/list/all")
    public Object listAllAnimals() {
        List<Animal> animalList;
        if (animalRepository.findAll().isEmpty()) {
            return "No animal registred!";
        }
        animalList = animalRepository.findAll();

        return animalList;
    }
}
