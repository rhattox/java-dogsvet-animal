package com.dogsvet.animal.animalapi.repository;

import com.dogsvet.animal.animalapi.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
