package com.Project.PetClinic.PetClinic.Model.Services;

import java.util.Set;

import com.Project.PetClinic.PetClinic.Model.Pet;

public interface PetService extends CrudService<Pet, Long>{
	
	
	Pet findByLastName(String lastName);
}

