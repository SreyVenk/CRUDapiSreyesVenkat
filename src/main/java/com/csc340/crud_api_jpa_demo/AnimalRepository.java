package com.csc340.crud_api_jpa_demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    // Find all animals by species
    List<Animal> findBySpecies(String species);

    // Find animals whose names contain a specified string
    List<Animal> findByNameContaining(String name);
}
