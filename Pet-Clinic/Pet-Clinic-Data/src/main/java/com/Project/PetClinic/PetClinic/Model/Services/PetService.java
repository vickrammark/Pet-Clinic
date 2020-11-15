package com.Project.PetClinic.PetClinic.Model.Services;

import java.util.Set;

import com.Project.PetClinic.PetClinic.Model.Pet;

public interface PetService {
	
	
	Pet findById(Long id);
	
	Pet findByLastName(String lastName);
	
	Pet save(Pet Pet);

	Set<Pet>findAll();

}

